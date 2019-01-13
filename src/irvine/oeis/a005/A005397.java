package irvine.oeis.a005;

import irvine.math.TwoDimensionalWalk;
import irvine.math.z.Z;
import irvine.oeis.a001.A001665;

/**
 * A005397.
 * @author Sean A. Irvine
 */
public class A005397 extends A001665 {

  private long mC = 0;

  {
    super.next();
    super.next();
    super.next();
  }

  @Override
  protected boolean check(final TwoDimensionalWalk walk, final int x, final int y) {
    if (x == 0 && y == 0) {
      ++mC;
    }
    return super.check(walk, x, y);
  }

  @Override
  public Z next() {
    mC = 0;
    super.next();
    return Z.valueOf(mC).shiftLeft(2);
  }
}
