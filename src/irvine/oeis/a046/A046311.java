package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046311 Numbers that are divisible by at least 9 primes (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046311 implements Sequence {

  private long mN = 511;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN).bigOmega() >= 9) {
        return Z.valueOf(mN);
      }
    }
  }
}
