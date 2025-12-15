package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.a007.A007442;

/**
 * A082594 Constant term when a polynomial of degree n-1 is fitted to the first n primes.
 * @author Sean A. Irvine
 */
public class A082594 extends A007442 {

  private Z mSum = Z.ZERO;
  private long mSign = -1;

  @Override
  public Z next() {
    mSign = -mSign;
    mSum = mSum.add(super.next().multiply(mSign));
    return mSum;
  }
}
