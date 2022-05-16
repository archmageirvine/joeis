package irvine.oeis.a078;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A078567 Number of arithmetic subsequences of [1..n] with length &gt; 1.
 * @author Sean A. Irvine
 */
public class A078567 implements Sequence {

  protected long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 1; k < mN; ++k) {
      sum = sum.add(Jaguar.factor(k).sigma0().multiply(mN - k));
    }
    return sum;
  }
}
