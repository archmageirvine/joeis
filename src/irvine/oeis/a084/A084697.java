package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084697 a(1) = 2; for n &gt;= 1, k&gt;=1, a(n+1) = a(n) + k*n is the smallest such prime.
 * @author Sean A. Irvine
 */
public class A084697 extends Sequence1 {

  private Z mA = Z.TWO;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      do {
        mA = mA.add(mN);
      } while (!mA.isProbablePrime());
    }
    return mA;
  }
}
