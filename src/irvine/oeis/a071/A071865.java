package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.util.array.DynamicLongArray;

/**
 * A071865 Smallest k such that the simple continued fraction for Sum(d|k, 1/d) contains exactly n elements.
 * @author Sean A. Irvine
 */
public class A071865 extends A071862 {

  private final DynamicLongArray mFirsts = new DynamicLongArray();
  private int mM = 0;

  @Override
  public Z next() {
    ++mM;
    while (mFirsts.get(mM) == 0) {
      final int v = super.next().intValueExact();
      if (mFirsts.get(v) == 0) {
        mFirsts.set(v, mN);
      }
    }
    return Z.valueOf(mFirsts.get(mM));
  }
}
