package irvine.math.group;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

import irvine.math.z.Z;

/**
 * Enumerate abelian subgroups of GL(2,Z_n).
 * @author Gregory Morse
 */
public final class Gl2AbelianSubgroups {

  private Gl2AbelianSubgroups() { }

  private static final class AbelianSubgroup {
    private final BitSet mElements;
    private final int[] mGenerators;

    private AbelianSubgroup(final BitSet elements, final int[] generators) {
      mElements = elements;
      mGenerators = generators;
    }

    private boolean commutes(final Gl2ResidueGroup group, final int g) {
      for (final int h : mGenerators) {
        if (group.multiply(g, h) != group.multiply(h, g)) {
          return false;
        }
      }
      return true;
    }
  }

  /**
   * Count abelian subgroups, distinguishing conjugate subgroups.
   * @param modulus positive modulus
   * @return subgroup count
   */
  public static Z count(final int modulus) {
    if (modulus == 1) {
      return Z.ONE;
    }
    final Gl2ResidueGroup group = new Gl2ResidueGroup(modulus);
    final BitSet trivial = new BitSet();
    trivial.set(group.identity());
    final Set<BitSet> seen = new HashSet<>();
    seen.add(trivial);
    final Deque<AbelianSubgroup> queue = new ArrayDeque<>();
    queue.add(new AbelianSubgroup(trivial, new int[0]));
    while (!queue.isEmpty()) {
      final AbelianSubgroup h = queue.remove();
      final BitSet skipped = (BitSet) h.mElements.clone();
      for (final int g : group.elements()) {
        if (!skipped.get(g) && h.commutes(group, g)) {
          // The extension consists of the cosets H, gH, g^2H, ...
          // Elements in the same first coset generate the same extension.
          final BitSet next = (BitSet) h.mElements.clone();
          for (int x = g; !h.mElements.get(x); x = group.multiply(g, x)) {
            for (int y = h.mElements.nextSetBit(0); y >= 0; y = h.mElements.nextSetBit(y + 1)) {
              final int z = group.multiply(x, y);
              next.set(z);
              if (x == g) {
                skipped.set(z);
              }
            }
          }
          if (seen.add(next)) {
            final int size = h.mGenerators.length;
            final int[] generators = Arrays.copyOf(h.mGenerators, size + 1);
            generators[size] = g;
            queue.add(new AbelianSubgroup(next, generators));
          }
        }
      }
    }
    return Z.valueOf(seen.size());
  }
}
