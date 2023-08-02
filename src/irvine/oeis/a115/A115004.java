package irvine.oeis.a115;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A115004 a(n) = Sum_{i=1..n, j=1..n, gcd(i,j)=1} (n+1-i)*(n+1-j).
 * @author Georg Fischer
 */
public class A115004 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A115004(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A115004() {
    super(1);
  }

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int i = 1; i <= mN; ++i) {
      for (int j = 1; j <= mN; ++j) {
        if (LongUtils.gcd(i, j) == 1) {
          sum = sum.add((long) (mN + 1 - i) * (mN + 1 - j));
        }
      }
    }
    return sum;
  }
}
