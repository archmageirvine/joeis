package irvine.oeis.a053;

import irvine.math.z.Z;

/**
 * A053301 Prime gaps associated with A053299.
 * @author Sean A. Irvine
 */
public class A053301 extends A053299 {

  @Override
  public Z next() {
    final Z p = super.next();
    return mPrime.nextPrime(p).subtract(p);
  }
}

