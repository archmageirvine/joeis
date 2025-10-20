package irvine.oeis.a389;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A389785 allocated for Michel Lagneau.
 * @author Sean A. Irvine
 */
public class A389785 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply2();
    long p = 1;
    while (true) {
      p = mPrime.nextPrime(p);
      if (mA.multiply(p).square().add(1).isProbablePrime()) {
        return Z.valueOf(p);
      }
    }
  }
}

