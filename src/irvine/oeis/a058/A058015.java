package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058015 Numbers k such that 2^k + k^3 is prime.
 * @author Sean A. Irvine
 */
public class A058015 implements Sequence {

  private Z mN = Z.ZERO;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mA = mA.multiply2();
      mN = mN.add(1);
      if (mA.add(mN.pow(3)).isProbablePrime()) {
        return mN;
      }
    }
  }
}
