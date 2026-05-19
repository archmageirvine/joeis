package irvine.oeis.a395;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicLongArray;

/**
 * A395803 Minimum numerators corresponding to the denominators in A395231.
 * @author Sean A. Irvine
 */
public class A395803 extends Sequence1 {

  private final DynamicLongArray mFirsts = new DynamicLongArray();
  private int mN = 0;
  private long mDen = 1;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
      ++mDen;
      for (long num = 1; num < mDen; ++num) {
        Q frac = new Q(num, mDen);
        int len = 1;
        while (!frac.num().isOne()) {
          frac = frac.subtract(new Q(Z.ONE, frac.den().divide(frac.num()).add(1)));
          ++len;
        }
        if (mFirsts.get(len) == 0) {
          mFirsts.set(len, num);
        }
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
