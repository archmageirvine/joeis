package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072723 Integers which are exactly the concatenation of the first m odd numbers (A019519) divided by their sum (A000290 = m^2).
 * @author Sean A. Irvine
 */
public class A072723 extends Sequence1 {

  private long mN = -1;
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
      long t = (mN + 1) / 2;
      t *= t;
      if (mS.mod(t) == 0) {
        return mS.divide(t);
      }
    }
  }
}
