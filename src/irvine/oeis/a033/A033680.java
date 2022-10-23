package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A033680 a(1) = 1; a(n) is smallest number &gt;= a(n-1) such that the juxtaposition a(1)a(2)...a(n) is a prime.
 * @author Sean A. Irvine
 */
public class A033680 extends Sequence1 {

  private final StringBuilder mA = new StringBuilder();
  private Z mPrev = null;

  protected long start() {
    return 1;
  }
  
  @Override
  public Z next() {
    if (mA.length() == 0) {
      mA.append(start());
      mPrev = Z.valueOf(start() | 1); // Make odd so we can increment by 2s in later iterations
      return Z.valueOf(start());
    }
    while (!new Z(new StringBuilder(mA).append(mPrev)).isProbablePrime()) {
      mPrev = mPrev.add(2);
    }
    mA.append(mPrev);
    return mPrev;
  }
}
