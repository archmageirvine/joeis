package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.z.Binomial;

/**
 * A002370.
 * @author Sean A. Irvine
 */
public class A002370 implements Sequence {

  private long mN = -1;
  private Z mA = Z.ONE;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      final long k = 2 * mN - 1;
      final Z t = mB.multiply(Z.valueOf(k).square()).subtract(mA.multiply(Binomial.binomial(k, 3)).multiply(3));
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
