package irvine.oeis.a004;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004612 Numbers that are divisible only by primes congruent to 2 mod 3.
 * @author Sean A. Irvine
 */
public class A004612 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.mod(3) != 0) { // Efficiency
        boolean ok = true;
        for (final Z p : Jaguar.factor(mN).toZArray()) {
          if (p.mod(3) != 2) {
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

