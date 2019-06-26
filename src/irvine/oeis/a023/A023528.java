package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023528 Exponent of 2 in prime factorization of <code>prime(n)*prime(n-1) + 1</code>.
 * @author Sean A. Irvine
 */
public class A023528 extends A023523 {

  @Override
  public Z next() {
    final Z t = super.next();
    t.makeOdd();
    return Z.valueOf(t.auxiliary());
  }
}
