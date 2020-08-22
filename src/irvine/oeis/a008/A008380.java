package irvine.oeis.a008;

import irvine.math.q.HarmonicSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008380 4*(2n-1)!*H(2n), where H(n) = Sum 1/i are harmonic numbers.
 * @author Sean A. Irvine
 */
public class A008380 implements Sequence {

  private final HarmonicSequence mH = new HarmonicSequence();
  private Z mF = Z.FOUR;
  private int mN = 0;

  @Override
  public Z next() {
    mH.nextQ();
    if (++mN > 1) {
      mF = mF.multiply(2 * mN - 1).multiply(2 * mN - 2);
    }
    return mH.nextQ().multiply(mF).toZ();
  }
}


