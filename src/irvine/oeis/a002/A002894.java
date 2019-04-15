package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a000.A000984;

/**
 * A002894 <code>a(n) = binomial(2n, n)^2</code>.
 * @author Sean A. Irvine
 */
public class A002894 extends A000984 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
