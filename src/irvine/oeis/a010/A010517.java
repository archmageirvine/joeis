package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.a002.A002193;

/**
 * A010517 Decimal expansion of square root of 65.
 * @author Sean A. Irvine
 */
public class A010517 extends A002193 {

  @Override
  protected Z n() {
    return Z.valueOf(65);
  }
}
