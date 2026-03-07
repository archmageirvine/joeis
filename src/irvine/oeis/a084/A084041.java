package irvine.oeis.a084;

import irvine.math.z.Z;

/**
 * A084041 Primes obtained as the ratio of successive terms of A084039 + 1; i.e., a(n) = max(A084039(n), A084039(n+1))/min(A084039(n), A084039(n+1)) + 1.
 * @author Sean A. Irvine
 */
public class A084041 extends A084039 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return (t.compareTo(mA) > 0 ? t.divide(mA) : mA.divide(t)).add(1);
  }
}

