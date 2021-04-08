package irvine.oeis.a046;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046310 Numbers that are divisible by exactly 8 primes counting multiplicity.
 * @author Sean A. Irvine
 */
public class A046310 implements Sequence {

  private long mN = 255;

  @Override
  public Z next() {
    while (true) {
      if (Cheetah.factor(++mN).bigOmega() == 8) {
        return Z.valueOf(mN);
      }
    }
  }
}
