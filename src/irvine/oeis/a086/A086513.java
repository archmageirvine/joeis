package irvine.oeis.a086;

import irvine.math.z.Z;

/**
 * A086513 Primes arising in A086512: a(n)= (2n-1)-th partial sum of A086512.
 * @author Sean A. Irvine
 */
public class A086513 extends A086512 {

  @Override
  public Z next() {
    super.next();
    final Z res = mSum;
    super.next();
    return res;
  }
}

