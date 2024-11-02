package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072872 a(n) is the smallest positive number k such that n divides 2^k - k.
 * @author Sean A. Irvine
 */
public class A072872 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    Z k = Z.ZERO;
    while (true) {
      k = k.add(1);
      if (Z.TWO.modPow(k, mN).equals(k.mod(mN))) {
        return k;
      }
    }
  }
}

