package irvine.oeis.a061;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061365 Numbers k such that either k or its reversal (but not both) is prime.
 * @author Sean A. Irvine
 */
public class A061365 extends Sequence1 {

  private Z mN = Z.TEN;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.isProbablePrime() ^ Functions.REVERSE.z(mN).isProbablePrime()) {
        return mN;
      }
    }
  }
}

