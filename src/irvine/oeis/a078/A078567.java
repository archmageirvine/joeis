package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078567 Number of arithmetic subsequences of [1..n] with length &gt; 1.
 * @author Sean A. Irvine
 */
public class A078567 extends Sequence1 {

  protected long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 1; k < mN; ++k) {
      sum = sum.add(Functions.SIGMA0.z(k).multiply(mN - k));
    }
    return sum;
  }
}
