package irvine.oeis.a391;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A391616 allocated for Kaloian Ivanov.
 * @author Sean A. Irvine
 */
public class A391616 extends A000040 {

  private Z mA = null;
  private long mN = 0;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      while (mA.compareTo(++mN) > 0) {
        super.next();
      }
      mA = mA.add(super.next()).add(1);
    }
    return mA;
  }
}
