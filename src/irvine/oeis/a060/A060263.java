package irvine.oeis.a060;

import irvine.math.z.Z;

/**
 * A060263 a(n) = smallest prime q such that precisely n successive primes p starting at q have reciprocals with period p-1.
 * @author Sean A. Irvine
 */
public class A060263 extends A060262 {

  {
    setOffset(2);
    super.next();
  }

  @Override
  protected Z select(final long n, final Z p) {
    return p;
  }
}
