package irvine.math.group;

import java.util.Arrays;
import java.util.function.BiConsumer;

/**
 * Enumerate abelian subgroups of an upper unitriangular group in characteristic two.
 * @author Gregory Morse
 */
final class AbelianSylowSubgroups {

  private AbelianSylowSubgroups() { }

  private static boolean contains(final int[] elements, final int value) {
    for (final int x : elements) {
      if (x == value) {
        return true;
      }
    }
    return false;
  }

  private static boolean commutes(final short[][] product, final int[] generators, final int x) {
    for (final int g : generators) {
      if (product[g][x] != product[x][g]) {
        return false;
      }
    }
    return true;
  }

  private static void visit(final short[][] product, final BiConsumer<int[], int[]> visitor, final int[] generators,
                            final int[] elements, final int interval, final int pivots) {
    visitor.accept(generators, elements);
    // The bits are ordered by increasing priority of superdiagonals.
    // At the leading bit the product is XOR. Each subgroup has a unique
    // parent obtained by dropping its largest pivot, and the new coset
    // has a unique representative zero at all the existing pivot bits.
    for (int x = interval; x < product.length; ++x) {
      if ((x & pivots) == 0 && commutes(product, generators, x) && contains(elements, product[x][x])) {
        final int[] g = Arrays.copyOf(generators, generators.length + 1);
        g[generators.length] = x;
        final int[] members = Arrays.copyOf(elements, 2 * elements.length);
        for (int k = 0; k < elements.length; ++k) {
          members[k + elements.length] = product[elements[k]][x];
        }
        final int bit = Integer.highestOneBit(x);
        visit(product, visitor, g, members, 2 * bit, pivots | bit);
      }
    }
  }

  static void visit(final short[][] product, final BiConsumer<int[], int[]> visitor) {
    visit(product, visitor, new int[0], new int[] {0}, 1, 0);
  }
}
