package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.a002.A002193;

/**
 * A010533 Decimal expansion of square root of 82.
 * @author Sean A. Irvine
 */
public class A010533 extends A002193 {

  @Override
  protected Z n() {
    return Z.valueOf(82);
  }
}
