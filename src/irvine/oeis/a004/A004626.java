package irvine.oeis.a004;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004626 Divisible only by primes congruent to 3 mod 8.
 * @author Sean A. Irvine
 */
public class A004626 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      if (mN.mod(8) != 0) {
        boolean ok = true;
        for (final Z p : Cheetah.factor(mN).toZArray()) {
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

