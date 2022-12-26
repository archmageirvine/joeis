package irvine.oeis.a060;

import irvine.math.q.HarmonicSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A060746 Absolute value of numerator of non-Euler-constant term of Laurent expansion of Gamma function at s=-n.
 * @author Sean A. Irvine
 */
public class A060746 extends Sequence0 {

  private int mN = -1;
  private final HarmonicSequence mH = new HarmonicSequence();
  private Q mA = Q.ZERO;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    final Q h = mA;
    mA = mH.nextQ();
    mF = mF.multiply(mN);
    return h.divide(mA).multiply(mF).den();
  }
}
