package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023572 Exponent of 2 in prime factorization of prime(n) - 3.
 * @author Sean A. Irvine
 */
public class A023572 extends A000040 {

  {
    setOffset(3);
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    final Z t = super.next().subtract(3);
    t.makeOdd();
    return Z.valueOf(t.auxiliary());
  }
}
