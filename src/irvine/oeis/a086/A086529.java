package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A086529 Beginning with 2, distinct even numbers such that the arithmetic mean of successive pairs of terms gives odd primes in their natural order. {a(n) + a(n+1)}/2 = prime(n+1).
 * @author Sean A. Irvine
 */
public class A086529 extends A000040 {

  private long mN = 2;

  @Override
  public Z next() {
    final long p = super.next().longValueExact();
    if (p != 2) {
      mN = 2 * p - mN;
    }
    return Z.valueOf(mN);
  }
}

