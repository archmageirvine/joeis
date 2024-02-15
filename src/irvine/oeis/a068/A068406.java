package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068406 Numbers n such that n and 2n+1 have the same number of prime divisors.
 * @author Sean A. Irvine
 */
public class A068406 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN).omega() == Jaguar.factor(2 * mN + 1).omega()) {
        return Z.valueOf(mN);
      }
    }
  }
}

