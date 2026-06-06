package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.a007.A007001;
import irvine.util.array.DynamicLongArray;

/**
 * A085180 Array A(x,y) giving the position of the y-th x in A007001 listed by rising antidiagonals.
 * @author Sean A. Irvine
 */
public class A085180 extends A007001 {

  private int mN = 0;
  private int mM = -1;
  private final DynamicLongArray mPos = new DynamicLongArray();

  private Z t(final int row) {
    while (true) {
      final long pos = mPos.increment(row);
      while (mSeq.length() < pos) {
        super.next();
      }
      if (mSeq.get(pos - 1) == row) {
        return Z.valueOf(pos);
      }
    }
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN - mM + 1);
  }
}
