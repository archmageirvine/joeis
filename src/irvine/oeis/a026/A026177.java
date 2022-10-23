package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A026177 For n &gt;= 2, let h=floor(n/2), L=n-h, R=n+h; then a(R)=n if n odd or a(L) already defined, otherwise a(L)=n.
 * @author Sean A. Irvine
 */
public class A026177 extends Sequence1 {

  private final LongDynamicLongArray mA = new LongDynamicLongArray();
  {
    mA.set(1L, 1L);
  }
  private long mN = 0;
  private long mM = 1;

  @Override
  public Z next() {
    ++mN;
    while (mA.get(mN) == 0) {
      ++mM;
      final long h = mM / 2;
      final long l = mM - h;
      final long r = mM + h;
      if ((mM & 1) == 1 || mA.get(l) != 0) {
        mA.set(r, mM);
      } else {
        mA.set(l, mM);
      }
    }
    return Z.valueOf(mA.get(mN));
  }
}
