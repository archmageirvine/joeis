package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A065079 Primes &gt; 3 for which the alternating bit sum (A065359) is not equal to 1 or 2.
 * @author Sean A. Irvine
 */
public class A065079 extends A000040 {

  {
    super.next(); // 2
    super.next(); // 3
  }

  static long alternatingBitSum(final Z n) {
    long sum = 0;
    for (int k = 0, sign = 1; k <= n.bitLength(); ++k, sign = -sign) {
      if (n.testBit(k)) {
        sum += sign;
      }
    }
    return sum;
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final long abs = alternatingBitSum(p);
      if (abs != 1 && abs != 2) {
        return p;
      }
    }
  }
}

