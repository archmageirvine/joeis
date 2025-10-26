package irvine.oeis.a081;

import irvine.math.group.QuadraticFieldUtils;
import irvine.math.z.Z;
import irvine.oeis.a005.A005117;
import irvine.util.array.LongDynamicArray;

/**
 * A081349.
 * @author Sean A. Irvine
 */
public class A081363 extends A005117 {

  private long mN = 0;
  private final LongDynamicArray<Z> mFirsts = new LongDynamicArray<>();

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == null) {
      final Z s = super.next();
      if (!s.isOne()) {
        final long c = QuadraticFieldUtils.classNumber(s.mod(4) > 1 ? s.multiply(4) : s);
        if (mFirsts.get(c) == null) {
          mFirsts.set(c, s);
        }
      }
    }
    return mFirsts.get(mN);
  }
}

