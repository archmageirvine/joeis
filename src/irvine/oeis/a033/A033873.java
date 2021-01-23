package irvine.oeis.a033;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033873 Difference between first prime &gt; 10^n (A003617) and 10^n.
 * @author Sean A. Irvine
 */
public class A033873 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    final Z p = mPrime.nextPrime(mA).subtract(mA);
    mA = mA.multiply(10);
    return p;
  }
}
