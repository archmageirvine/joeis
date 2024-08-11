package irvine.oeis.a070;

import irvine.math.z.Z;

/**
 * A070934 Smallest prime equal to the sum of 2n+1 consecutive primes.
 * @author Sean A. Irvine
 */
public class A070934 extends A070281 {

  {
    setOffset(0);
  }

  @Override
  public Z next() {
    final Z res = super.next();
    super.next();
    return res;
  }
}
