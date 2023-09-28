package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A066039 Largest prime less than or equal to the sum of first n primes (A007504).
 * @author Sean A. Irvine
 */
public class A066039 extends A000040 {

  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    mSum = mSum.add(super.next());
    return mPrime.prevPrime(mSum.add(1));
  }
}
