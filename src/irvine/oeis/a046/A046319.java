package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046319 Odd numbers divisible by exactly 6 primes (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046319 implements Sequence {

  private long mN = 727;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (Jaguar.factor(mN).bigOmega() == 6) {
        return Z.valueOf(mN);
      }
    }
  }
}
