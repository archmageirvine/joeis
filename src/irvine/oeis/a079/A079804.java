package irvine.oeis.a079;

import irvine.math.z.Z;

/**
 * A079804 Initial term of n-th group in A079802.
 * @author Sean A. Irvine
 */
public class A079804 extends A079802 {

  @Override
  public Z next() {
    final long res = mP;
    super.next();
    return Z.valueOf(mPrime.nextPrime(res));
  }
}

