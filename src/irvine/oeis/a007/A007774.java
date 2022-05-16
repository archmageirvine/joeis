package irvine.oeis.a007;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007774 Numbers that are divisible by exactly 2 different primes; numbers n with omega(n) = A001221(n) = 2.
 * @author Sean A. Irvine
 */
public class A007774 implements Sequence {

  private long mN = 5;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN).toZArray().length == 2) {
        return Z.valueOf(mN);
      }
    }
  }
}
