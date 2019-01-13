package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a060.A060628;

/**
 * A002753.
 * @author Sean A. Irvine
 */
public class A002753 extends A060628 {

  private int mN = -1;

  @Override
  public Z next() {
    return row(++mN).coeff(mN & ~1).toZ().abs();
  }
}
