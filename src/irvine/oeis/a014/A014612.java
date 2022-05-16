package irvine.oeis.a014;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014612 Numbers that are the product of exactly three (not necessarily distinct) primes.
 * @author Sean A. Irvine
 */
public class A014612 implements Sequence {

  private long mN = 7;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN).bigOmega() == 3) {
        return Z.valueOf(mN);
      }
    }
  }
}
