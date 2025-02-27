package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A075605 Smallest k not a palindrome and not divisible by 10 such that k and R(k) (A004086) both are divisible by the n-th prime.
 * @author Sean A. Irvine
 */
public class A075605 extends A000040 {

  @Override
  public Z next() {
    final long p = super.next().longValueExact();
    long k = 0;
    while (true) {
      k += p;
      if (k % 10 != 0) {
        final long kr = Functions.REVERSE.l(k);
        if (k != kr && kr % p == 0) {
          return Z.valueOf(k);
        }
      }
    }
  }
}

