package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A074721 Concatenate the primes as 2357111317192329313..., then insert commas from left to right so that between each pair of successive commas is a prime, always making the new prime as small as possible.
 * @author Sean A. Irvine
 */
public class A074721 extends A000040 {

  private final StringBuilder mA = new StringBuilder();

  @Override
  public Z next() {
    int k = 0;
    while (true) {
      ++k;
      if (mA.length() < k) {
        mA.append(super.next());
      }
      final Z t = new Z(mA.substring(0, k));
      if (t.isProbablePrime()) {
        mA.delete(0, k);
        return t;
      }
    }
  }
}
