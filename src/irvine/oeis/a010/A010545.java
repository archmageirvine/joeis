package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.a002.A002193;

/**
 * A010545 Decimal expansion of square root of 94.
 * @author Sean A. Irvine
 */
public class A010545 extends A002193 {

  @Override
  protected Z n() {
    return Z.valueOf(94);
  }
}
