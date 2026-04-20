package irvine.oeis.a394;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A394631 Least prime p such that p^2 + n! is again the square of a prime, or 0 if no such prime exists.
 * @author Sean A. Irvine
 */
public class A394631 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN <= 3) {
      return Z.ZERO;
    }
    final Z f = Functions.FACTORIAL.z(mN);
    Z p = Z.ONE;
    while (true) {
      p = mPrime.nextPrime(p);
      final Z[] t = f.add(p.square()).sqrtAndRemainder();
      if (t[1].isZero() && t[0].isProbablePrime()) {
        return p;
      }
    }
  }
}
