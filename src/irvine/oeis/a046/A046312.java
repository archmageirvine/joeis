package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046312 Numbers that are divisible by exactly 9 primes with multiplicity.
 * @author Sean A. Irvine
 */
public class A046312 extends Sequence1 {

  private long mN = 511;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN).bigOmega() == 9) {
        return Z.valueOf(mN);
      }
    }
  }
}
