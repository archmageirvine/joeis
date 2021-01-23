package irvine.oeis.a038;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038513 Numbers with three not necessarily distinct prime factors with smallest prime &gt;=5.
 * @author Sean A. Irvine
 */
public class A038513 implements Sequence {

  private Z mN = Z.valueOf(124);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.gcd(Z.SIX).equals(Z.ONE) && Cheetah.factor(mN).bigOmega() == 3) {
        return mN;
      }
    }
  }
}
