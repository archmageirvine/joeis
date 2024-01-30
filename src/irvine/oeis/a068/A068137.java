package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068109.
 * @author Sean A. Irvine
 */
public class A068137 extends Sequence1 {

  private final StringBuilder mLeft = new StringBuilder();
  private final StringBuilder mRight = new StringBuilder();
  private long mN = 0;

  @Override
  public Z next() {
    mLeft.append(++mN);
    mRight.insert(0, mN);
    final Z t0 =new Z(mLeft.toString() + mRight);
    if (t0.isProbablePrime()) {
      return t0;
    }
    long lim = 20;
    long mod = 10;
    long k = 9;
    while (true) {
      if (++k == lim) {
        k = 0;
        lim *= 10;
        mod *= 10;
      }
      final Z t = new Z(mLeft + String.valueOf(k % mod) + mRight);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
