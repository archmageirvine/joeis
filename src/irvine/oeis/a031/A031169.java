package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A031169 a(n) = prime(n+7) - prime(n).
 * @author Sean A. Irvine
 */
public class A031169 extends A000040 {

  private Z[] mA = new Z[shift()];
  {
    for (int k = 0; k < mA.length; ++k) {
      mA[k] = super.next();
    }
  }

  protected int shift() {
    return 7;
  }

  @Override
  public Z next() {
    final Z t = mA[0];
    System.arraycopy(mA, 1, mA, 0, mA.length - 1);
    mA[mA.length - 1] = super.next();
    return mA[mA.length - 1].subtract(t);
  }
}
