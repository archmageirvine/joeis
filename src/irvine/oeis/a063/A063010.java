package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.a062.A062033;

/**
 * A063010 Carryless binary square of n; also Moser-de Bruijn sequence written in binary.
 * a(n) = A062033(n)/10, i.e., with final zero removed.
 * @author Georg Fischer
 */
public class A063010 extends A062033 {

  @Override
  public Z next() {
    return super.next().divide(10);
  }
}
