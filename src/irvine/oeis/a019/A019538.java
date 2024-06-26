package irvine.oeis.a019;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A019538 Triangle of numbers T(n,k) = k!*Stirling2(n,k) read by rows (n &gt;= 1, 1 &lt;= k &lt;= n).
 * @author Sean A. Irvine
 */
public class A019538 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A019538(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A019538() {
    super(1);
  }

  private long mN = 0;
  private long mK = 0;
  private Z mFactorialK = Z.ONE;

  @Override
  public Z next() {
    if (++mK > mN) {
      ++mN;
      mK = 1;
      mFactorialK = Z.ONE;
    }
    mFactorialK = mFactorialK.multiply(mK);
    return mFactorialK.multiply(Functions.STIRLING2.z(mN, mK));
  }
}
