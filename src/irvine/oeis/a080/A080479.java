package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A080454.
 * @author Sean A. Irvine
 */
public class A080479 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;
  private long mMul = 10;

  @Override
  public Z next() {
    ++mN;
    Z digits = Z.ZERO;
    for (long k = 0; k < mN; ++k) {
      if (++mM == mMul) {
        mMul *= 10;
      }
      digits = digits.multiply(mMul).add(mM);
    }
    final int[] cnts = ZUtils.digitCounts(digits);
    final StringBuilder sb = new StringBuilder();
    int firstNonzero = 1;
    while (cnts[firstNonzero] == 0) {
      ++firstNonzero;
    }
    sb.append(firstNonzero);
    --cnts[firstNonzero];
    for (int d = 0; d < cnts.length; ++d) {
      sb.append(String.valueOf(d).repeat(cnts[d]));
    }
    return new Z(sb);
  }
}

