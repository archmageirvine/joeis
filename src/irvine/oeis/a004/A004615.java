package irvine.oeis.a004;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004615 Divisible only by primes congruent to 1 mod 5.
 * @author Sean A. Irvine
 */
public class A004615 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      if (mN.mod(5) != 0) {
        boolean ok = true;
        for (final Z p : Jaguar.factor(mN).toZArray()) {
          if (p.mod(5) != 1) {
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

