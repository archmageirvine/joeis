package irvine.oeis.a062;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.AbstractSequence;

/**
 * A062852 Largest n-digit strong pseudoprimes (in base 2).
 * @author Sean A. Irvine
 */
public class A062852 extends AbstractSequence {

  private Z mT = Z.valueOf(1000);
  private final Fast mPrime = new Fast();

  /** Construct the sequence. */
  public A062852() {
    super(4);
  }

  @Override
  public Z next() {
    mT = mT.multiply(10);
    Z n = mT.subtract(1);
    while (true) {
      if (!mPrime.isPrime(n) && ZUtils.sprpTest(2L, n)) {
        return n;
      }
      n = n.subtract(2);
    }
  }
}
