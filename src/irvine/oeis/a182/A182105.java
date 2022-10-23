package irvine.oeis.a182;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A182105 Number of elements merged by bottom-up merge sort.
 * <code>(PARI) for(n=1, 50, for(k=0, valuation(n, 2), print1(2^k", ")))</code>
 * @author Georg Fischer
 */
public class A182105 extends Sequence1 {

  private long mN = 1;
  private int mK = -1;
  private long mVal = LongUtils.valuation(mN, 2);

  @Override
  public Z next() {
    ++mK;
    if (mK > mVal) {
      ++mN;
      mK = 0;
      mVal = LongUtils.valuation(mN, 2);
    }
    return Z.ONE.shiftLeft(mK);
  }
}
