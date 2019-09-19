package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicLongArray;

/**
 * A026172 For <code>n &gt;= 2</code>, let <code>h={n/2 ], L=n-h, R=n+h</code>; then <code>a(R)=n</code> if n even or <code>a(L)</code> already defined, else <code>a(L)=n</code>.
 * @author Sean A. Irvine
 */
public class A026172 implements Sequence {

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
      if ((mM & 1) == 0 || mA.get(l) != 0) {
        mA.set(r, mM);
      } else {
        mA.set(l, mM);
      }
    }
    return Z.valueOf(mA.get(mN));
  }
}
