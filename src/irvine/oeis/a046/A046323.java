package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046323 Odd numbers divisible by exactly 10 primes (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046323 implements Sequence {

  private long mN = 59047;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (Jaguar.factor(mN).bigOmega() == 10) {
        return Z.valueOf(mN);
      }
    }
  }
}
