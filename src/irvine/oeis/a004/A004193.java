package irvine.oeis.a004;

import irvine.math.q.BernoulliSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A004193 a(n) = -(-1)^n*2*(2*n+1)!*Bernoulli(2*n)/(n!*2^n).
 * @author Sean A. Irvine
 */
public class A004193 extends Sequence1 {

  private final BernoulliSequence mB = new BernoulliSequence(1);
  private int mN = 0;
  private Z mF = Z.ONE;
  private Z mD = Z.TWO;

  @Override
  public Z next() {
    ++mN;
    mF = mF.multiply(mN);
    mD = mD.multiply(2L * mN).multiply(2L * mN + 1);
    mB.nextQ(); // skip odd
    return mB.nextQ().multiply(mD).toZ().abs().shiftRight(mN).divide(mF);
  }
}
