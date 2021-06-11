package irvine.oeis.a048;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import irvine.math.partitions.IntegerPartition;
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

  private long count(final int n, final int prevP, final int prevFace, final int prevK) {
    if (n <= 0) {
      return 1;
    }
    assert n > 0;
    System.out.println("n=" + n + " f=" + prevFace + " k=" + prevK + " p=" + prevP);
    long c = 0;
    for (int k = 0; k < prevK; ++k) {
      //for (int f = 0; f <= prevFace - 2 * prevK + 1; ++f) {
      for (int f = 0; f <= prevFace - 2 * prevK + 1; ++f) {
        final int p = 3 * (f - k) + 1;
        if (p < prevP) {
          c += count(n - p, prevP, f, k);
        }
      }
    }
    return c;
  }

  //@Override
  public Z nextXX() {
    ++mN;
    System.out.println("Trying for " + mN);
    return Z.valueOf(count(mN, mN + 1, mN + 1, mN + 1));
  }

  // Attempt 3

  private boolean isOverMajored(final int[] outer, final int[] inner) {
    if (inner.length > outer.length) {
      return false;
    }
    if (inner[0] >= outer[0]) {
      return false;
    }
    for (int k = 1; k < inner.length; ++k) {
      if (inner[k] > outer[k]) {
        return false;
      }
    }
    return true;
  }

  private long count(final int n, final int[] majors) {
    if (n <= 0) {
      return n == 0 ? 1 : 0; // todo can n < 0 occur
    }
    long cnt = 0;
    for (int arm = (n - 1) / 3; arm >= 0; --arm) {
      long c = 0;
      if (arm == 0) {
        c += count(n - 1, new int[0]);
      } else {
        final IntegerPartition part = new IntegerPartition(arm);
        int[] p;
        while ((p = part.next()) != null) {
          if (!isOverMajored(majors, p)) {
            c += count(n - 3 * arm - p.length, p);
            //c += count(n - 3 * arm, p);
          }
        }
        if (c == 0) {
          break;
        }
        cnt += c;
      }
    }
    return cnt;
  }

  @Override
  public Z next() {
    ++mN;
    System.out.println("Trying for " + mN);
    long count = 0;
    for (int arm = (mN - 1) / 3; arm >= 0; --arm) {
      long c = 0;
      if (arm == 0) {
        c += count(mN - 1, new int[0]);
      } else {
        final IntegerPartition part = new IntegerPartition(arm);
        int[] p;
        while ((p = part.next()) != null) {
          c += count(mN - 3 * arm - p.length, p);
        }
      }
      if (c == 0) {
        System.out.println("Bailing out with arm size " + arm);
        break;
      }
      count += c;
    }
    return Z.valueOf(count);
  }

}

