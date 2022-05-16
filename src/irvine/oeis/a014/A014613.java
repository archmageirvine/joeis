package irvine.oeis.a014;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014613 Numbers that are products of 4 primes.
 * @author Sean A. Irvine
 */
public class A014613 implements Sequence {

  private long mN = 15;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN).bigOmega() == 4) {
        return Z.valueOf(mN);
      }
    }
  }
}
