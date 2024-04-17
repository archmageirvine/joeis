package irvine.oeis.a038;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A038513 Numbers with three not necessarily distinct prime factors with smallest prime &gt;=5.
 * @author Sean A. Irvine
 */
public class A038513 extends Sequence0 {

  private Z mN = Z.valueOf(124);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.gcd(Z.SIX).equals(Z.ONE) && Functions.BIG_OMEGA.l(mN) == 3) {
        return mN;
      }
    }
  }
}
