package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083106 Triangle read by rows in which the n-th row contains n smallest numbers whose product == 1 mod n.
 * @author Sean A. Irvine
 */
public class A083106 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;
  private long mK = 0;
  private long mProd = 1;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
      mK = 1;
      mProd = 1;
      return Z.ONE;
    }
    if (mM + 1 < mN) {
      while (Functions.GCD.l(++mK, mN) > 1) {
        // do nothing
      }
      mProd *= mK;
      mProd %= mN;
      return Z.valueOf(mK);
    }
    while ((mProd * ++mK) % mN != 1) {
      // do nothing
    }
    return Z.valueOf(mK);
  }
}

