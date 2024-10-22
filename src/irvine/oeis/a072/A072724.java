package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072724 Integers which are exactly the concatenation of the first m even numbers (A019520) divided by their sum (A002378 = m^2+m).
 * @author Sean A. Irvine
 */
public class A072724 extends Sequence1 {

  private long mN = 0;
  private Z mS = Z.ZERO;
  private long mM = 10;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (mN >= mM) {
        mM *= 10L;
      }
      mS = mS.multiply(mM).add(mN);
      long t = mN / 2;
      t *= t + 1;
      if (mS.mod(t) == 0) {
        return mS.divide(t);
      }
    }
  }
}
