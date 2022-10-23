package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046310 Numbers that are divisible by exactly 8 primes counting multiplicity.
 * @author Sean A. Irvine
 */
public class A046310 extends Sequence1 {

  private long mN = 255;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN).bigOmega() == 8) {
        return Z.valueOf(mN);
      }
    }
  }
}
