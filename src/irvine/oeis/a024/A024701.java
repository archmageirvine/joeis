package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A024701 <code>a(n) = (-1 + prime(n+1)^2)/4</code>.
 * @author Sean A. Irvine
 */
public class A024701 extends A000040 {

  {
    super.next(); // skip 2
  }

  @Override
  public Z next() {
    return super.next().square().subtract(1).divide(4);
  }
}
