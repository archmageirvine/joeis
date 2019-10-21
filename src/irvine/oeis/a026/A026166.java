package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicLongArray;

/**
 * A026166 For <code>n &gt;= 2</code>, let <code>h=floor((n-1)/2), L=n-h, R=n+h</code>; then <code>a(L)=n</code> if <code>a(L)</code> not yet defined, otherwise <code>a(R)=n</code>; thus <code>|a(n)-n| = floor((1/2)*(a(n)-1))</code>.
 * @author Sean A. Irvine
 */
public class A026166 implements Sequence {

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
      final long h = (mM - 1) / 2;
      final long l = mM - h;
      if (mA.get(l) == 0) {
        mA.set(l, mM);
      } else {
        mA.set(mM + h, mM);
      }
    }
    return Z.valueOf(mA.get(mN));
  }
}
