package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046314 Numbers that are divisible by exactly 10 primes with multiplicity.
 * @author Sean A. Irvine
 */
public class A046314 implements Sequence {

  private long mN = 1023;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN).bigOmega() == 10) {
        return Z.valueOf(mN);
      }
    }
  }
}
