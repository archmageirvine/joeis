package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicLongArray;

/**
 * A026136 For <code>n &gt;= 2</code>, let <code>L=n-[ n/2 ], R=n+[ n/2 ];</code> then <code>a(L)=n</code> if <code>a(L)</code> not yet defined, else <code>a(R)=n;</code> thus <code>|a(n)-n|=[ (1/2)*a(n) ]</code>.
 * @author Sean A. Irvine
 */
public class A026136 implements Sequence {

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
      final long l = mM - mM / 2;
      if (mA.get(l) == 0) {
        mA.set(l, mM);
      } else {
        mA.set(mM + mM / 2, mM);
      }
    }
    return Z.valueOf(mA.get(mN));
  }
}
