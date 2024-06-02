package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070152 Take pairs (x,y) with Sum_{j = x..y} j = concatenation of x and y. Sort pairs on y then x. This sequence gives x of each pair.
 * @author Sean A. Irvine
 */
public class A070152 extends Sequence1 {

  private long mY = 1;
  private long mX = 0;
  private long mM = 10;

  protected Z select(final long x, final long y) {
    return Z.valueOf(x);
  }

  @Override
  public Z next() {
    while (true) {
      if (++mX >= mY) {
        if (++mY == mM) {
          mM *= 10;
        }
        mX = 1;
      }
      final long concat = mX * mM + mY;
      final long sum = (mX + mY) * (mY + 1 - mX) / 2;
      if (concat == sum) {
        return select(mX, mY);
      }
    }
  }
}
