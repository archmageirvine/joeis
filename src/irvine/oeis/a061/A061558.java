package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.a007.A007918;

/**
 * A061558 The smallest difference of an increasing arithmetic progression of n primes with the minimal possible first term (A007918(n)).
 * @author Sean A. Irvine
 */
public class A061558 extends A007918 {

  {
    super.next();
    setOffset(1);
  }

  private boolean is(final Z start, final Z delta, final long n) {
    Z t = start.add(delta); // already prime by construction
    for (int k = 2; k < n; ++k) {
      t = t.add(delta);
      if (!t.isProbablePrime()) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    final Z start = super.next();
    if (Z.ONE.equals(mN)) {
      return Z.ZERO;
    }
    final long n = mN.longValueExact();
    Z p = mPrime.nextPrime(start);
    while (true) {
      final Z delta = p.subtract(start);
      if (is(start, delta, n)) {
        return delta;
      }
      p = mPrime.nextPrime(p);
    }
  }
}
