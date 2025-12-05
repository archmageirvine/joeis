package irvine.oeis.a390;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;
import irvine.util.array.DynamicLongArray;

/**
 * A390785 a(n) is the least k such that the number of integers between (1/4)*prime(k) and (1/4)*prime(k+1) is n.
 * @author Sean A. Irvine
 */
public class A390785 extends A000040 {

  private final DynamicLongArray mFirsts = new DynamicLongArray();
  private int mN = 0;
  private long mM = -1;
  private Z mP = Z.TWO;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
      ++mM;
      final Z q = mP;
      mP = super.next();
      final int d = mP.divide(4).subtract(q.divide(4)).intValueExact();
      if (mFirsts.get(d) == 0) {
        mFirsts.set(d, mM);
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
