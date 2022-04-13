package irvine.oeis.a056;

import irvine.math.z.Z;

/**
 * A056061 Number of square divisors of central binomial coefficients.
 * @author Sean A. Irvine
 */
public class A056061 extends A056056 {

  @Override
  public Z next() {
    return mFactor.factorize(super.next()).sigma0();
  }
}
