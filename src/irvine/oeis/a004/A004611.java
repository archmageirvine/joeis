package irvine.oeis.a004;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004611 Divisible only by primes congruent to 1 mod 3.
 * @author Sean A. Irvine
 */
public class A004611 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.mod(3) != 0) { // Efficiency, avoids entire factorization
        boolean ok = true;
        for (final Z p : Jaguar.factor(mN).toZArray()) {
          if (p.mod(3) != 1) {
            ok = false;
            break;
          }
        }
        if (ok) {
          return mN;
        }
      }
    }
  }
}

