package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002194 Decimal expansion of <code>sqrt(3)</code>.
 * @author Sean A. Irvine
 */
public class A002194 extends A002193 {

  @Override
  protected Z n() {
    return Z.THREE;
  }
}
