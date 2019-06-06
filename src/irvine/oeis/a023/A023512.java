package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023512 Exponent of 2 in prime factorization of <code>prime(n) + 1</code>.
 * @author Sean A. Irvine
 */
public class A023512 extends A000040 {

  @Override
  public Z next() {
    final Z t = super.next().add(1);
    t.makeOdd();
    return Z.valueOf(t.auxiliary());
  }
}
