package irvine.oeis.a361;

import irvine.math.q.BernoulliSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A361007 allocated for Artur Jasinski.
 * @author Sean A. Irvine
 */
public class A361007 extends Sequence0 {

  private final BernoulliSequence mB = new BernoulliSequence(0);
  private int mN = -1;
  private Z mF = Z.TWO;

  @Override
  public Z next() {
    if (++mN > 0) {
      mB.nextQ(); // skip odd
      mF = mF.multiply(2L * mN).multiply(2L * mN - 1);  // 2*(2n)!
    }
    final Z t = mB.nextQ().divide(mF).multiply(Z.ONE.shiftLeft(2 * mN).subtract(1)).multiply(Z.ONE.shiftLeft(4 * mN)).num();
    return (mN & 1) == 0 ? t.negate() : t;
  }
}
