package irvine.oeis.a123;

import irvine.math.z.Z;
import irvine.oeis.a000.A000898;

/**
 * A123071 Bishops on a <code>2n+1 X 2n+1</code> board (see Robinson paper for details).
 * @author Sean A. Irvine
 */
public class A123071 extends A000898 {

  private Z mA = super.next();
  private boolean mEven = false;

  @Override
  public Z next() {
    mEven = !mEven;
    if (mEven) {
      return mA.square();
    }
    final Z t = mA;
    mA = super.next();
    return t.multiply(mA);
  }
}
