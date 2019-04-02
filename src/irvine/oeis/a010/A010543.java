package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.a002.A002193;

/**
 * A010543 Decimal expansion of square root of 92.
 * @author Sean A. Irvine
 */
public class A010543 extends A002193 {

  @Override
  protected Z n() {
    return Z.valueOf(92);
  }
}
