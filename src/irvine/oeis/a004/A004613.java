package irvine.oeis.a004;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A004613 Numbers that are divisible only by primes congruent to 1 mod 4.
 * @author Sean A. Irvine
 */
public class A004613 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      boolean ok = true;
      for (final Z p : Jaguar.factor(mN).toZArray()) {
        if (p.mod(4) != 1) {
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

