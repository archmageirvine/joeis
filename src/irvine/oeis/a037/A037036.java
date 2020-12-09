package irvine.oeis.a037;

import irvine.factor.prime.Fast;
import irvine.factor.prime.Prime;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A037036 Least k such that 2^n+1-k is a prime.
 * @author Sean A. Irvine
 */
public class A037036 implements Sequence {

  private Prime mPrime = new Fast();
  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply2();
    return mA.add(1).subtract(mPrime.prevPrime(mA.add(2)));
  }
}
