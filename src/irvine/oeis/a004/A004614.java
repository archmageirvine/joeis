package irvine.oeis.a004;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004614 Numbers that are divisible only by primes congruent to <code>3 mod 4</code>.
 * @author Sean A. Irvine
 */
public class A004614 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      boolean ok = true;
      for (final Z p : Cheetah.factor(mN).toZArray()) {
        if (p.mod(4) != 3) {
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

