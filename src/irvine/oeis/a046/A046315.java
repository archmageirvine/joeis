package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046315 Odd semiprimes: odd numbers divisible by exactly 2 primes (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046315 extends Sequence1 {

  private Z mN = Z.SEVEN;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      if (Jaguar.factor(mN).isSemiprime()) {
        return mN;
      }
    }
  }
}
