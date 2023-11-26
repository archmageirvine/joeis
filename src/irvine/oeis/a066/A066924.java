package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066924 Numbers n such that the GCD of n and the Chowla's function of n (A048050) is &gt;= n/3.
 * @author Sean A. Irvine
 */
public class A066924 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (!mN.isProbablePrime()) {
        final Z chowla = Jaguar.factor(mN).sigma().subtract(mN.add(1)).max(Z.ZERO);
        if (chowla.gcd(mN).multiply(3).compareTo(mN) >= 0) {
          return mN;
        }
      }
    }
  }
}
