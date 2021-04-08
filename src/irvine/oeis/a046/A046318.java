package irvine.oeis.a046;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046318 Odd numbers divisible by exactly 5 primes (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046318 implements Sequence {

  private long mN = 241;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (Cheetah.factor(mN).bigOmega() == 5) {
        return Z.valueOf(mN);
      }
    }
  }
}
