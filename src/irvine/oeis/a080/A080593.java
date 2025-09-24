package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060010.
 * @author Sean A. Irvine
 */
public class A080593 extends Sequence1 {

  private long mX = -1;
  private long mY = 0;
  private long mZ = 0;

  protected long select(final long x, final long y, final long z) {
    return x;
  }

  @Override
  public Z next() {
    while (true) {
      if (++mX > mY) {
        if (++mY > mZ) {
          ++mZ;
          mY = 0;
        }
        mX = 0;
      }
      final long nim = mX ^ mY ^ mZ;
      if (nim == 0) {
        return Z.valueOf(select(mX, mY, mZ));
      }
    }
  }
}
