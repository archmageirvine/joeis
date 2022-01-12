package irvine.oeis.a052;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A052099 Smallest nonzero square with n distinct digits each occurring exactly n times.
 * @author Sean A. Irvine
 */
public class A052099 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    if (mN == 10) {
      return null;
    }
    final Z sqr = Z.TEN.pow(++mN * mN - 1);
    Z a = sqr.sqrt();
    while (true) {
      final int[] cnts = ZUtils.digitCounts(a.square());
      if (IntegerUtils.isNonzeroConstant(cnts) == mN) {
        return a.square();
      }
      a = a.add(1);
    }
  }
}

