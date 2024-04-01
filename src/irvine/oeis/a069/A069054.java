package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069054 a(1)=0 a(2)=1 a(n)=concatenate(a(n-1)a(n-2)...a(1))-a(n-1).
 * @author Sean A. Irvine
 */
public class A069054 extends Sequence1 {

  private final StringBuilder mA = new StringBuilder();
  private Z mPrev = null;

  @Override
  public Z next() {
    if (mA.length() == 0) {
      mA.append('0');
      return Z.ZERO;
    } else if (mPrev == null) {
      mPrev = Z.ONE;
      return Z.ONE;
    }
    mA.insert(0, mPrev);
    mPrev = new Z(mA).subtract(mPrev);
    return mPrev;
  }
}

