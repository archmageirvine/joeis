package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a065.A065091;

/**
 * A024701 a(n) = (-1 + prime(n+1)^2)/4.
 * @author Sean A. Irvine
 */
public class A024701 extends A065091 {

  @Override
  public Z next() {
    return super.next().square().subtract(1).divide(4);
  }
}
