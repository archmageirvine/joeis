package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075606 Smallest k not a palindrome and not divisible by 10 such that k and R(k) both are divisible by n, or 0 if n is divisible by 10.
 * @author Sean A. Irvine
 */
public class A075606 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN % 10 == 0) {
      return Z.ZERO;
    }
    long k = 0;
    while (true) {
      k += mN;
      if (k % 10 != 0) {
        final long kr = Functions.REVERSE.l(k);
        if (k != kr && kr % mN == 0) {
          return Z.valueOf(k);
        }
      }
    }
  }
}

