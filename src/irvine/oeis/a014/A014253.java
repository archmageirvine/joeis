package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a000.A000283;

/**
 * A014253 <code>a(n) = b(n)^2</code>, where <code>b(n) = b(n-1)^2 + b(n-2)^2 (A000283)</code>.
 * @author Sean A. Irvine
 */
public class A014253 extends A000283 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
