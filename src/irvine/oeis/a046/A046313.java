package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046313 Numbers that are divisible by at least 10 primes (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046313 extends Sequence1 {

  private long mN = 1023;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN).bigOmega() >= 10) {
        return Z.valueOf(mN);
      }
    }
  }
}
