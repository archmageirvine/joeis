package irvine.oeis.a020;

import irvine.math.z.Z;

/**
 * A020990.
 * @author Sean A. Irvine
 */
public class A020990 extends A020985 {

  private Z mA = Z.ZERO;
  private boolean mEven = false;

  @Override
  public Z next() {
    mEven = !mEven;
    mA = mA.signedAdd(mEven, super.next());
    return mA;
  }
}
