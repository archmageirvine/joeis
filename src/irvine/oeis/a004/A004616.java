package irvine.oeis.a004;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004616 Divisible only by primes congruent to 2 mod 5.
 * @author Sean A. Irvine
 */
public class A004616 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.mod(5) != 0) {
        boolean ok = true;
        for (final Z p : Jaguar.factor(mN).toZArray()) {
          if (p.mod(5) != 2) {
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

