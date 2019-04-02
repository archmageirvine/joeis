package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.a002.A002193;

/**
 * A010475 Decimal expansion of square root of 19.
 * @author Sean A. Irvine
 */
public class A010475 extends A002193 {

  @Override
  protected Z n() {
    return Z.valueOf(19);
  }
}
