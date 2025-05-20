package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.a076.A076991;

/**
 * A077396 Square roots of squares arising in A076991.
 * @author Sean A. Irvine
 */
public class A077396 extends A076991 {

  private Z mA = super.next();
  private Z mB = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = mB;
    mB = super.next();
    return t.add(mA).add(mB).sqrt();
  }
}
