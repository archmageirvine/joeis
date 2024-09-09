package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A072140.
 * @author Sean A. Irvine
 */
public class A072185 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final String s = p.toString();
      long q = 2;
      Z sum = Z.ZERO;
      for (int k = 0; k < s.length(); ++k, q = mPrime.nextPrime(q)) {
        sum = sum.add(Z.valueOf(s.charAt(k) - '0').pow(q));
      }
      if (mPrime.isPrime(sum)) {
        return p;
      }
    }
  }
}
