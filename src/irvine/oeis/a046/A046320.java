package irvine.oeis.a046;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046320 Odd numbers divisible by exactly 7 primes (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046320 implements Sequence {

  private long mN = 2185;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (Cheetah.factor(mN).bigOmega() == 7) {
        return Z.valueOf(mN);
      }
    }
  }
}
