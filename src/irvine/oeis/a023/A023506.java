package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023506 Exponent of 2 in prime factorization of prime(n) - 1.
 * @author Sean A. Irvine
 */
public class A023506 extends A000040 {

  @Override
  public Z next() {
    final Z t = super.next().subtract(1);
    t.makeOdd();
    return Z.valueOf(t.auxiliary());
  }
}
