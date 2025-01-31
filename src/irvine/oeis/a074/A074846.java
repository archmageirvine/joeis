package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074846 a(n) is the smallest k &gt; n such that n*k+1 is prime.
 * @author Sean A. Irvine
 */
public class A074846 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    Z k = mN;
    while (true) {
      k = k.add(1);
      if (mN.multiply(k).add(1).isProbablePrime()) {
        return k;
      }
    }
  }
}
