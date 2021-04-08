package irvine.oeis.a046;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046307 Numbers that are divisible by at least 7 primes (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046307 implements Sequence {

  private long mN = 127;

  @Override
  public Z next() {
    while (true) {
      if (Cheetah.factor(++mN).bigOmega() >= 7) {
        return Z.valueOf(mN);
      }
    }
  }
}
