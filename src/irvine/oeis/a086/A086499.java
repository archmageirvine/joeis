package irvine.oeis.a086;

import irvine.math.z.Z;

/**
 * A086499 Primes arising in A086498: a(n) = (2n)-th partial sum of A086498.
 * @author Sean A. Irvine
 */
public class A086499 extends A086498 {

  @Override
  public Z next() {
    super.next();
    super.next();
    return mSum;
  }
}

