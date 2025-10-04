package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A080828 Triangle read by rows in which n-th row gives trajectory of n (omitting n itself) under the map k -&gt; 3k-1 if k odd, k -&gt; k/2 if k even, stopping when reach 1, 5 or 17.
 * @author Sean A. Irvine
 */
public class A080828 extends Sequence2 {

  private static final Z Z17 = Z.valueOf(17);
  private long mN = 2;
  private Z mM = Z.TWO;

  @Override
  public Z next() {
    if (mM.isOne() || Z.FIVE.equals(mM) || Z17.equals(mM)) {
      mM = Z.valueOf(++mN);
    }
    mM = mM.isEven() ? mM.divide2() : mM.multiply(3).subtract(1);
    return mM;
  }
}

