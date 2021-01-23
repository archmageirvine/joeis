package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038510 Composite numbers with smallest prime factor &gt;= 7.
 * @author Sean A. Irvine
 */
public class A038510 implements Sequence {

  private static final Z Z30 = Z.valueOf(30);
  private Z mN = Z.valueOf(48);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.gcd(Z30).equals(Z.ONE) && !mN.isProbablePrime()) {
        return mN;
      }
    }
  }
}
