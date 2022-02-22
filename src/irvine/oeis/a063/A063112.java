package irvine.oeis.a063;

import irvine.math.z.Z;

/**
 * A063112 a(1) = 1; a(n+1) = a(n) + product of nonzero digits of a(n) when written in base 3. Display sequence in base 3.
 * @author Georg Fischer
 */
public class A063112 extends A063113 {

  @Override
  public Z next() {
    return new Z(super.next().toString(3));
  }
}
