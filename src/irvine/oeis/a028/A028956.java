package irvine.oeis.a028;

import irvine.factor.factor.Cheetah;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028956 Theta series of quadratic form (or lattice) with Gram matrix <code>[ 4, 1; 1, 4 ]</code>.
 * @author Sean A. Irvine
 */
public class A028956 implements Sequence {

  // After Michael Somos

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (final Z dd : Cheetah.factor(mN).divisors()) {
      final long d = dd.longValue();
      sum = sum.add(LongUtils.kronecker(-15, d) - LongUtils.kronecker(-3, d) * LongUtils.kronecker(5, mN / d));
    }
    return sum;
  }
}
