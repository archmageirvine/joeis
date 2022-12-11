package irvine.oeis.a060;

import irvine.math.z.InverseSigma;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060666 Sigma(x) = n has exactly ten solutions.
 * @author Sean A. Irvine
 */
public class A060666 extends Sequence1 {

  private Z mN = Z.valueOf(502);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      if (InverseSigma.countInverseSigma(mN).equals(Z.TEN)) {
        return mN;
      }
    }
  }
}
