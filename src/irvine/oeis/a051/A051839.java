package irvine.oeis.a051;

import irvine.math.IntegerUtils;
import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A051839 Number of partitions of n with parts (with repetitions) forming a division lattice (i.e., closed under GCD and LCM).
 * @author Sean A. Irvine
 */
public class A051839 extends Sequence1 {

  // After Charles R Greathouse IV

  private int mN = 0;

  private boolean containsForward(final int[] p, final int v, final int start) {
    for (int k = start; k < p.length; ++k) {
      if (p[k] == v) {
        return true;
      }
    }
    return false;
  }

  private boolean containsBackward(final int[] p, final int v, final int start) {
    for (int k = start; k >= 0; --k) {
      if (p[k] == v) {
        return true;
      }
    }
    return false;
  }

  private boolean is(final int[] p) {
    for (int k = p[0] == 1 ? 1 : 0; k < p.length - 1; ++k) {
      for (int j = k + 1; j < p.length; ++j) {
        if (!containsForward(p, IntegerUtils.gcd(p[j], p[k]), j)) {
          return false;
        }
        if (!containsBackward(p, IntegerUtils.lcm(p[j], p[k]), j)) {
          return false;
        }
      }
    }
    return true;
  }

  @Override
  public Z next() {
    final IntegerPartition part = new IntegerPartition(++mN);
    int[] p;
    long cnt = 0;
    while ((p = part.next()) != null) {
      if (is(p)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
