package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.a000.A000110;

/**
 * A008827 Coefficients from fractional iteration of e^x <code>-1</code>.
 * @author Sean A. Irvine
 */
public class A008827 extends A000110 {

  {
    super.next();
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(2);
  }
}
