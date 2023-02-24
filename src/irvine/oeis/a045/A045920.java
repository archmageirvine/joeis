package irvine.oeis.a045;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A045920 Numbers m such that the factorizations of m..m+1 have the same number of primes (including multiplicities).
 * @author Sean A. Irvine
 */
public class A045920 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN).bigOmega() == Jaguar.factor(mN + 1).bigOmega()) {
        return Z.valueOf(mN);
      }
    }
  }
}
