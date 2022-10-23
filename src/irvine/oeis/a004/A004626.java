package irvine.oeis.a004;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A004626 Divisible only by primes congruent to 3 mod 8.
 * @author Sean A. Irvine
 */
public class A004626 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      if (mN.mod(8) != 0) {
        boolean ok = true;
        for (final Z p : Jaguar.factor(mN).toZArray()) {
          if (p.mod(8) != 3) {
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

