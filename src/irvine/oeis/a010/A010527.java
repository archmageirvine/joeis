package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.a002.A002193;

/**
 * A010527 Decimal expansion of <code>sqrt(3)/2</code>.
 * @author Sean A. Irvine
 */
public class A010527 extends A002193 {

  @Override
  protected Z n() {
    return Z.valueOf(75);
  }
}
