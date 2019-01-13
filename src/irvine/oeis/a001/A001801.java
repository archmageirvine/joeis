package irvine.oeis.a001;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001801.
 * @author Sean A. Irvine
 */
public class A001801 implements Sequence {

  private int mN = -1;
  private int mTwoReduces = 1;

  @Override
  public Z next() {
    int m = ++mN + 4;
    while ((m & 1) == 0) {
      ++mTwoReduces;
      m >>>= 1;
    }
    return Binomial.binomial(2 * mN + 4, mN + 2).multiply(mN + 1).multiply(mN + 2).shiftRight(mN + 5 - mTwoReduces);
  }
}
