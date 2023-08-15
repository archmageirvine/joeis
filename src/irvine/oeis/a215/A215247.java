package irvine.oeis.a215;

import irvine.math.z.Z;
import irvine.oeis.a003.A003151;

/**
 * A215247 A Beatty sequence: a(n) = floor((n-1/2)*(2 + 2*sqrt(2))).
 * @author Georg Fischer
 */
public class A215247 extends A003151 {

  @Override
  public Z next() {
    final Z result = super.next();
    super.next();
    return result;
  }
}
