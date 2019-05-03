package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.a001.A001405;

/**
 * A018224 <code>a(n) = C(n, floor(n/2))^2 = A001405(n)^2</code>.
 * @author Sean A. Irvine
 */
public class A018224 extends A001405 {

  @Override
  public Z next() {
    return super.next().square();
  }
}

