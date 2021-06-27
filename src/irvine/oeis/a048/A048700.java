package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048700 Binary palindromes of odd length (written in base 10).
 * @author Sean A. Irvine
 */
public class A048700 implements Sequence {

  private String mForward = "";
  private StringBuilder mReverse = new StringBuilder();
  private long mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > 1) {
      mForward = Long.toBinaryString(++mN);
      mReverse = new StringBuilder(mForward).reverse();
      mM = 0;
    }
    return new Z(mForward + mM + mReverse, 2);
  }
}
