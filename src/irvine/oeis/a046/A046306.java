package irvine.oeis.a046;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046306 Numbers that are divisible by exactly 6 primes with multiplicity.
 * @author Sean A. Irvine
 */
public class A046306 implements Sequence {

  private long mN = 63;

  @Override
  public Z next() {
    while (true) {
      if (Cheetah.factor(++mN).bigOmega() == 6) {
        return Z.valueOf(mN);
      }
    }
  }
}
