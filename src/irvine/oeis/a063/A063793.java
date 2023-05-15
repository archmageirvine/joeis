package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A063793 a(n) = Min{ q prime | nextprime(q) - q - 1 = prime(n)}, or 0 if none exist.
 * @author Sean A. Irvine
 */
public class A063793 extends A000040 {

  {
    super.next();
    setOffset(2);
  }

  @Override
  public Z next() {
    final Z t = super.next().add(1);
    Z p = Z.TWO;
    Z q = Z.THREE;
    while (true) {
      if (q.subtract(p).equals(t)) {
        return p;
      }
      p = q;
      q = mPrime.nextPrime(q);
    }
  }
}
