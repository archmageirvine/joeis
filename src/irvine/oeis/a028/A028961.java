package irvine.oeis.a028;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028961 Theta series of quadratic form (or lattice) with Gram matrix <code>[ 3, 1; 1, 8 ]</code>.
 * @author Sean A. Irvine
 */
public class A028961 implements Sequence {

  // todo this is not right, must be a phi/psi type solution anyway

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    long cnt = 0;
    for (long y = 0; y * y <= mN; ++y) {
      final long t = mN - 8 * y * y;
      final long d = 12 * t + 4 * y * y;
      if (d >= 0) {
        final long s = LongUtils.sqrt(d);
        if (s * s == d) {
          ++cnt;
        }
      }
    }
    return Z.valueOf(2 * cnt);
  }

//  @Override
//  public Z next() {
//    if (++mN == 0) {
//      return Z.ONE;
//    }
//    Z sum = Z.ZERO;
//    for (final Z dd : Cheetah.factor(mN).divisors()) {
//      final long d = dd.longValue();
//      sum = sum.add(LongUtils.kronecker(-23, d)); // - LongUtils.kronecker(-2, d) * LongUtils.kronecker(23, mN / d));
//    }
//    return sum;
//  }
}
