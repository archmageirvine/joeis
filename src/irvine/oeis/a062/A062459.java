package irvine.oeis.a062;

import irvine.math.Mobius;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062459 Primes of form n^2 + mu(n), where mu is A008683.
 * @author Sean A. Irvine
 */
public class A062459 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z t = Z.valueOf(++mN).square().add(Mobius.mobius(mN));
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
