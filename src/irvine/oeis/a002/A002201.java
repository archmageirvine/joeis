package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a000.A000705;

/**
 * A002201.
 * @author Sean A. Irvine
 */
public class A002201 extends A000705 {

  private Z mP = Z.ONE;

  @Override
  public Z next() {
    mP = mP.multiply(super.next());
    return mP;
  }
}
