package irvine.oeis.a051;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051886 a(n) is the minimal prime p such that 2^n * p + 1 is prime.
 * @author Sean A. Irvine
 */
public class A051886 implements Sequence {

  private final Fast mPrime = new Fast();
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z p = Z.ONE;
    while (true) {
      p = mPrime.nextPrime(p);
      if (p.shiftLeft(mN).add(1).isProbablePrime()) {
        return p;
      }
    }
  }
}
