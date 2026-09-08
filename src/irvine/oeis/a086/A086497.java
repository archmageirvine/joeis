package irvine.oeis.a086;

import irvine.math.z.Z;

/**
 * A086497 Primes arising in A086496. a(n) = Sum {A086946(k), k = 1 to 2n}= 2n-th partial sum of A086496.
 * @author Sean A. Irvine
 */
public class A086497 extends A086496 {

  @Override
  public Z next() {
    super.next();
    super.next();
    return mSum;
  }
}

