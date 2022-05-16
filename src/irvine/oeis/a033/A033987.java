package irvine.oeis.a033;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033987 Numbers that are divisible by at least 4 primes (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A033987 implements Sequence {

  private long mN = 15;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN).bigOmega() >= 4) {
        return Z.valueOf(mN);
      }
    }
  }
}
