package irvine.oeis.a079;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A079677 Distance from F(n) to closest prime, where F(n) is the n-th Fibonacci number.
 * @author Sean A. Irvine
 */
public class A079677 extends A000045 {

  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    final Z f = super.next();
    if (f.isProbablePrime()) {
      return Z.ZERO;
    }
    if (f.isZero()) {
      return Z.TWO;
    }
    return f.subtract(mPrime.prevPrime(f)).min(mPrime.nextPrime(f).subtract(f));
  }
}

