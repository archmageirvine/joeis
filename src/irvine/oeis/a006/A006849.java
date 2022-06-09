package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a005.A005159;

/**
 * A006849 Number of strongly self-dual planar maps with 2n edges.
 * @author Sean A. Irvine
 */
public class A006849 extends A005159 {

  private final A005159 mHalfRate = new A005159();
  private boolean mEven = true;

  {
    super.next();
  }

  @Override
  public Z next() {
    mEven = !mEven;
    if (mEven) {
      return super.next().divide2();
    } else {
      return mHalfRate.next().add(super.next()).divide2();
    }
  }
}
