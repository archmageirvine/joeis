package irvine.oeis.a001;

import irvine.math.z.Z;

/**
 * A001557 <code>1^n + 2^n +</code> ... <code>+ 10^n</code>.
 * @author Sean A. Irvine
 */
public class A001557 extends A001556 {

  private Z mTen = null;

  @Override
  public Z next() {
    if (mTen == null) {
      mTen = Z.ONE;
    } else {
      mTen = mTen.multiply(10);
    }
    return mTen.add(super.next());
  }
}
