package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.a002.A002193;

/**
 * A010550 Decimal expansion of square root of 99.
 * @author Sean A. Irvine
 */
public class A010550 extends A002193 {

  @Override
  protected Z n() {
    return Z.valueOf(99);
  }
}
