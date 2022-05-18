package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046322 Odd numbers divisible by exactly 9 primes (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046322 implements Sequence {

  private long mN = 19681;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (Jaguar.factor(mN).bigOmega() == 9) {
        return Z.valueOf(mN);
      }
    }
  }
}
