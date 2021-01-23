package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023520 Exponent of 2 in prime factorization of p(n)*p(n-1) - 1.
 * @author Sean A. Irvine
 */
public class A023520 extends A023515 {

  {
    super.next();
  }

  @Override
  public Z next() {
    final Z t = super.next();
    t.makeOdd();
    return Z.valueOf(t.auxiliary());
  }
}
