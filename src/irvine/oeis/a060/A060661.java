package irvine.oeis.a060;

import irvine.math.z.InverseSigma;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060661 Sigma(x) = n has exactly five solutions.
 * @author Sean A. Irvine
 */
public class A060661 extends Sequence1 {

  private Z mN = Z.valueOf(70);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      if (InverseSigma.countInverseSigma(mN).equals(Z.FIVE)) {
        return mN;
      }
    }
  }
}
