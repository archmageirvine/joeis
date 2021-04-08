package irvine.oeis.a046;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046313 Numbers that are divisible by at least 10 primes (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046313 implements Sequence {

  private long mN = 1023;

  @Override
  public Z next() {
    while (true) {
      if (Cheetah.factor(++mN).bigOmega() >= 10) {
        return Z.valueOf(mN);
      }
    }
  }
}
