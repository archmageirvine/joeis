package irvine.oeis.a060;

import irvine.math.z.InverseSigma;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060663 Sigma(x) = n has exactly seven solutions.
 * @author Sean A. Irvine
 */
public class A060663 extends Sequence1 {

  private Z mN = Z.valueOf(238);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      if (InverseSigma.countInverseSigma(mN).equals(Z.SEVEN)) {
        return mN;
      }
    }
  }
}
