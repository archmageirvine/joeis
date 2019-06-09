package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023579 Exponent of 2 in prime factorization of <code>prime(n)+3</code>.
 * @author Sean A. Irvine
 */
public class A023579 extends A000040 {

  @Override
  public Z next() {
    final Z t = super.next().add(3);
    t.makeOdd();
    return Z.valueOf(t.auxiliary());
  }
}
