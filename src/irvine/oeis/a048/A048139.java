package irvine.oeis.a048;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Triple;

/**
 * A048139.
 * @author Sean A. Irvine
 */
public class A048139 implements Sequence {

  // todo This is actually a new attempt at A048141

  private Set<Set<Triple<Integer>>> mA = Collections.emptySet();
  private Set<Set<Triple<Integer>>> mB = Collections.emptySet();
  private Set<Set<Triple<Integer>>> mC = null;

  @Override
  public Z next() {
    if (mC == null) {
      mC = Collections.singleton(Collections.singleton(new Triple<>(0, 0, 0)));
    } else {
      // todo
      final HashSet<Set<Triple<Integer>>> next = new HashSet<>();
      // Add off symmetry axis point to n - 3
      for (final Set<Triple<Integer>> partition : mA) {
        for (final Triple<Integer> t : partition) {
          final int x = t.left();
          final int y = t.mid();
          final int z = t.right();
          // x + 1
          final Triple<Integer> tx = new Triple<>(x + 1, y, z);
          if (!partition.contains(tx) && (y == 0 || partition.contains(new Triple<>(x + 1, y - 1, z)))) {
            final Set<Triple<Integer>> x1 = new HashSet<>(partition);
            x1.add(tx);
            next.add(x1);
          }
          // y + 1
          if (y + 1 <= x) {
            final Triple<Integer> ty = new Triple<>(x, y + 1, z);
            if (!partition.contains(ty) && (x == 1 || partition.contains(new Triple<>(x - 1, y + 1, z)))) {
              final Set<Triple<Integer>> y1 = new HashSet<>(partition);
              y1.add(ty);
              next.add(y1);
            }
          }
          // z + 1
          if (z + 1 < y) {
            final Triple<Integer> tz = new Triple<>(x, y, z + 1);
            if (!partition.contains(tz)) {
              final Set<Triple<Integer>> z1 = new HashSet<>(partition);
              z1.add(tz);
              next.add(z1);
            }
          }
        }
      }
      // Add one symmetry point to n - 1
      for (final Set<Triple<Integer>> partition : mC) {
        for (final Triple<Integer> t : partition) {
          final int x = t.left();
          final int y = t.mid();
          final int z = t.right();
          // y + 1
//          if (y + 1 == x) {
//            final Triple<Integer> ty = new Triple<>(x, y + 1, z);
//            if (!partition.contains(ty)) {
//              final Set<Triple<Integer>> y1 = new HashSet<>(partition);
//              y1.add(ty);
//              next.add(y1);
//            }
//          }
          // z + 1
          if (z + 1 == y) {
            final Triple<Integer> tz = new Triple<>(x, y, z + 1);
            if (!partition.contains(tz)) {
              final Set<Triple<Integer>> z1 = new HashSet<>(partition);
              z1.add(tz);
              next.add(z1);
            }
          }
        }
      }
      mA = mB;
      mB = mC;
      mC = next;
    }
    System.out.println(mC);
    return Z.valueOf(mC.size());
  }
}

