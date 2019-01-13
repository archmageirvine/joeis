package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.a002.A002048;

/**
 * A004978.
 * @author Sean A. Irvine
 */
public class A004978 extends A002048 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.add(super.next());
    return mA;
  }
}
