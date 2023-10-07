package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A065894 Number of composites &lt;= 10^n.
 * @author Sean A. Irvine
 */
public class A065894 extends A002808 {

  {
    setOffset(0);
  }

  private long mM = 0;
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return Z.ZERO;
    }
    mA = mA.multiply(10);
    while (true) {
      ++mM;
      if (mA.equals(super.next())) {
        return Z.valueOf(mM);
      }
    }
  }
}
