package irvine.oeis.a038;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038802 Factor 2n+1 = (2^m1)*(3^m2)*(5^m3)*...; a(n) = number of initial zero exponents.
 * @author Sean A. Irvine
 */
public class A038802 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 1;

  @Override
  public Z next() {
    mN += 2;
    long c = 1;
    long p = 2;
    while (mN % (p = mPrime.nextPrime(p)) != 0) {
      ++c;
    }
    return Z.valueOf(c);
  }
}
