package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.a000.A000292;

/**
 * A001249 Squares of tetrahedral numbers: <code>binomial(n+3,n)^2</code>.
 * @author Sean A. Irvine
 */
public class A001249 extends A000292 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().square();
  }
}
