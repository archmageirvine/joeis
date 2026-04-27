package irvine.oeis.a394;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a014.A014156;
import irvine.util.array.LongDynamicArray;

/**
 * A394229 a(n) is the first start of exactly n consecutive numbers that are not the sum of a nonnegative cube and a triangular number.
 * @author Sean A. Irvine
 */
public class A394229 extends Sequence1 {

  private final LongDynamicArray<Z> mFirsts = new LongDynamicArray<>();
  private final Sequence mS = new A014156();
  private Z mA = mS.next();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == null) {
      final Z start = mA;
      long len = 0;
      while (true) {
        final Z t = mA;
        mA = mS.next();
        ++len;
        if (!mA.subtract(t).isOne()) {
          if (mFirsts.get(len) == null) {
            mFirsts.set(len, start);
          }
          break;
        }
      }
    }
    return mFirsts.get(mN);
  }
}
