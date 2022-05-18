package irvine.oeis.a014;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014614 Numbers that are products of 5 primes (or 5-almost primes, a generalization of semiprimes).
 * @author Sean A. Irvine
 */
public class A014614 implements Sequence {

  private long mN = 31;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN).bigOmega() == 5) {
        return Z.valueOf(mN);
      }
    }
  }
}
