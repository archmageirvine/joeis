package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.a002.A002193;

/**
 * A010544 Decimal expansion of square root of 93.
 * @author Sean A. Irvine
 */
public class A010544 extends A002193 {

  @Override
  protected Z n() {
    return Z.valueOf(93);
  }
}
