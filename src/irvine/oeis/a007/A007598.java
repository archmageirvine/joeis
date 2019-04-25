package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A007598 Squared Fibonacci numbers: <code>F(n)^2</code> where F = A000045.
 * @author Sean A. Irvine
 */
public class A007598 extends A000045 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
