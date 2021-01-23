package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038511 Composite numbers with smallest prime factor &gt;= 11.
 * @author Sean A. Irvine
 */
public class A038511 implements Sequence {

  private static final Z Z210 = Z.valueOf(210);
  private Z mN = Z.valueOf(120);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.gcd(Z210).equals(Z.ONE) && !mN.isProbablePrime()) {
        return mN;
      }
    }
  }
}
