package irvine.oeis.a394;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A394632 Least prime q such that q^2 - n! is again the square of a prime, or 0 if no such prime exists.
 * @author Sean A. Irvine
 */
public class A394632 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN <= 3) {
      return Z.ZERO;
    }
    final Z f = Functions.FACTORIAL.z(mN);
    Z q = Functions.CEIL_SQRT.z(f);
    while (true) {
      q = mPrime.nextPrime(q);
      final Z[] p = q.square().subtract(f).sqrtAndRemainder();
      if (p[1].isZero() && p[0].isProbablePrime()) {
        return q;
      }
    }
  }
}
