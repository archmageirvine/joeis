package irvine.oeis.a393;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A393202 a(n) = prime(n + 2)^2 - prime(n + 1)*prime(n).
 * @author Sean A. Irvine
 */
public class A393202 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    final Z q = mPrime.nextPrime(p);
    return mPrime.nextPrime(q).square().subtract(q.multiply(p));
  }
}
