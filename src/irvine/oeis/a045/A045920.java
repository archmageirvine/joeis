package irvine.oeis.a045;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045920 Numbers n such that factorizations of n and n+1 have the same number of primes (including multiplicities).
 * @author Sean A. Irvine
 */
public class A045920 implements Sequence {

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
