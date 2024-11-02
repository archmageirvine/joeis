package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A072807 n-th prime prime(n) written in base (prime(n) (mod prime(n-1))).
 * @author Sean A. Irvine
 */
public class A072807 extends A000040 {

  {
    super.next();
    setOffset(2);
  }

  @Override
  public Z next() {
    final Z p = super.next();
    return new Z(p.toString(p.mod(mPrime.prevPrime(p)).intValueExact()));
  }
}
