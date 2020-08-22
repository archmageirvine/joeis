package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.a000.A000522;

/**
 * A026243 a(n) = A000522(n) - 2.
 * @author Sean A. Irvine
 */
public class A026243 extends A000522 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(2);
  }
}
