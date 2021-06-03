package irvine.oeis.a048;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Triple;

/**
 * A048139 Number of planar partitions of n, when partitions that are rotations of each other (when regarded as 3-D objects) are counted only once.
 * @author Sean A. Irvine
 */
public class A048139 implements Sequence {

  // todo This is actually a new attempt at A048141
  // todo this is perhaps C3v + C3 !!
  // todo in general may need to add six points --- not 3

  private Set<Set<Triple<Integer>>> mA = Collections.emptySet();
  private Set<Set<Triple<Integer>>> mB = Collections.emptySet();
  private Set<Set<Triple<Integer>>> mC = null;

  private HashSet<Triple<Integer>> filledOut(final Set<Triple<Integer>> t) {
    final HashSet<Triple<Integer>> prt = new HashSet<>();
    for (final Triple<Integer> v : t) {
      prt.add(v);
      prt.add(new Triple<>(v.right(), v.left(), v.mid()));
      prt.add(new Triple<>(v.mid(), v.right(), v.left()));
    }
    return prt;
  }

  private String toString(final Set<Triple<Integer>> t) {
    final HashSet<Triple<Integer>> prt = filledOut(t);
    return prt.size() + " " + prt;
  }

  //@Override
  public Z nextX() {
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
          if (x + 1 >= y) {
            final Triple<Integer> tx = new Triple<>(x + 1, y, z);
            if (!partition.contains(tx)
              && (y == 0 || partition.contains(new Triple<>(x + 1, y - 1, z)))
              && (z == 0 || partition.contains(new Triple<>(x + 1, y, z - 1)))
            ) {
              final Set<Triple<Integer>> f = filledOut(partition);
              if (f.contains(new Triple<>(z, x, y)) && f.contains(new Triple<>(y, z, x))) {
                final Set<Triple<Integer>> x1 = new HashSet<>(partition);
                x1.add(tx);
                next.add(x1);
              }
            }
          }
          // y + 1
          if (y + 1 <= x && z <= y + 1) {
            // todo I think these tests are not strong enough
            final Triple<Integer> ty = new Triple<>(x, y + 1, z);
            if (!partition.contains(ty)
              && (x == 1 || partition.contains(new Triple<>(x - 1, y + 1, z)))
              && (z == 0 || partition.contains(new Triple<>(x, y + 1, z - 1)))
            ) {
              final Set<Triple<Integer>> f = filledOut(partition);
              if (f.contains(new Triple<>(z, x, y)) && f.contains(new Triple<>(y, z, x))) { // trivially true!
                final Set<Triple<Integer>> y1 = new HashSet<>(partition);
                y1.add(ty);
                next.add(y1);
                System.out.println("Added " + ty + " to " + partition + " --> " + y1);
              }
            }
          }
          // z + 1
//          if (z + 1 < y) {
//            final Triple<Integer> tz = new Triple<>(x, y, z + 1);
//            if (!partition.contains(tz)) {
//              final Set<Triple<Integer>> z1 = new HashSet<>(partition);
//              z1.add(tz);
//              next.add(z1);
//            }
//          }
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
          if (z + 1 == y && y == x) {
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
    //System.out.println(mC);
    for (final Set<Triple<Integer>> set : mC) {
      System.out.println(toString(set));
    }
    return Z.valueOf(mC.size());
  }

  private int mN = 0;

  private long count(final int n, final int part, final int k) {
    if (n == 0) {
      return 1;
    }
    assert n > 0;
    final int f = (part - 1) / 3 - k;
    long c = 0;
    for (int j = part; j > 0; j -= 3) {
      for (int u = k - 1; u > 0; --u) {
        final int g = (j - 1) / 3 - u;
        if (g <= f - 2 * k + 1) {
          c += count(n - j, j - 3, u);
        }
      }
    }
    return c;
  }

  @Override
  public Z next() {
    ++mN;
    final int j = 3 * ((mN - 1) / 3) + 1;
    long cnt = 0;
    for (int i = j; i > 0; i -= 3) {
      for (int u = i + 10; u > 0; --u) {
        cnt += count(mN, i, u);
      }
    }
    return Z.valueOf(cnt);
  }
}

