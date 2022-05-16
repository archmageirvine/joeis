package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046304 Divisible by at least 5 primes (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046304 implements Sequence {

  private long mN = 31;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN).bigOmega() >= 5) {
        return Z.valueOf(mN);
      }
    }
  }
}
