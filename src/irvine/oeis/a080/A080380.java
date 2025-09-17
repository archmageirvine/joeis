package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.util.array.LongDynamicLongArray;

/**
 * A003022.
 * @author Sean A. Irvine
 */
public class A080380 extends A080378 {

  private final LongDynamicLongArray mFirsts = new LongDynamicLongArray();
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
      Z t;
      do {
        ++mM;
        t = super.next();
      } while (!t.isZero());
      long cnt = 0;
      do {
        ++cnt;
        ++mM;
        t = super.next();
      } while (t.isZero());
      if (mFirsts.get(cnt) == 0) {
        mFirsts.set(cnt, mM - cnt);
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
