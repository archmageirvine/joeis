package irvine.oeis.a309;

import irvine.math.z.Z;
import irvine.oeis.a339.A339065;

/**
 * A309936 Irregular triangle read by rows: T(n,k) is the number of unlabeled loopless multigraphs with n edges covering k vertices, n &gt;= 1, 1 &lt;= k &lt;= 2*n.
 * @author Gregory Morse
 */
public class A309936 extends A339065 {
  private final boolean mLoops;
  private int mN = 0;
  private int mK = 0;
  private Z mPrevious;

  protected A309936(final boolean loops) {
    mLoops = loops;
    setOffset(1);
  }

  /** Construct the sequence. */
  public A309936() {
    this(false);
  }

  @Override
  protected boolean hasLoops() {
    return mLoops;
  }

  @Override
  public Z next() {
    if (++mK > 2 * mN) {
      ++mN;
      mK = 1;
      mPrevious = Z.ZERO;
    }
    final Z count = unrootedCounts(mK, mN).coeff(mN);
    final Z res = count.subtract(mPrevious);
    mPrevious = count;
    return res;
  }
}
