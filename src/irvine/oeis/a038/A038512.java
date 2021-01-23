package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038512 Nonprime numbers with smallest prime factor &gt;= 13.
 * @author Sean A. Irvine
 */
public class A038512 implements Sequence {

  private static final Z Z2310 = Z.valueOf(2310);
  private Z mN = Z.valueOf(168);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.gcd(Z2310).equals(Z.ONE) && !mN.isProbablePrime()) {
        return mN;
      }
    }
  }
}
