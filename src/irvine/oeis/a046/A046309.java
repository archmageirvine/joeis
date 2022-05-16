package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046309 Numbers that are divisible by at least 8 primes (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046309 implements Sequence {

  private long mN = 255;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN).bigOmega() >= 8) {
        return Z.valueOf(mN);
      }
    }
  }
}
