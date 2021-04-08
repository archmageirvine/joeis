package irvine.oeis.a046;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046321 Odd numbers divisible by exactly 8 primes (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046321 implements Sequence {

  private long mN = 6559;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (Cheetah.factor(mN).bigOmega() == 8) {
        return Z.valueOf(mN);
      }
    }
  }
}
