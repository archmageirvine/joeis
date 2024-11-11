package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.a046.A046758;
import irvine.util.array.LongDynamicArray;

/**
 * A073048 Starting term of the first length-n chain of equidigital numbers (A046758).
 * @author Sean A. Irvine
 */
public class A073048 extends A046758 {

  private final LongDynamicArray<Z> mFirsts = new LongDynamicArray<>();
  private Z mA = super.next();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == null) {
      final Z start = mA;
      long len = 1;
      do {
        mA = super.next();
        ++len;
      } while (mA.subtract(len - 1).equals(start));
      --len;
      if (mFirsts.get(len) == null) {
        mFirsts.set(len, start);
      }
    }
    return mFirsts.get(mN);
  }
}
