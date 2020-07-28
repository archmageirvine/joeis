package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.a173.A173380;

/**
 * A038746 Coefficients arising in the enumeration of configurations of linear chains.
 * @author Sean A. Irvine
 */
public class A038746 extends A173380 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(4).divide(8);
  }
}
