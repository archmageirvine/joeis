package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061955 Numbers n such that n divides the (left) concatenation of all numbers &lt;= n written in base 2 (most significant digit on right).
 * @author Sean A. Irvine
 * @author Georg Fischer
 */
public class A061955 extends Sequence1 {

  private int mBase;
  private long mN;
  private final StringBuilder mSb;
  private final StringBuilder mRb;

  /** Construct the sequence. */
  public A061955() {
    this(2);
  }

  /**
   * Generic constructor with parameter.
   * @param base number base
   */
  public A061955(final int base) {
    mBase = base;
    mN = 0;
    mRb = new StringBuilder();
    mSb = new StringBuilder();
  }

  private Z bump(final long n) {
    mRb.setLength(0);
    mRb.append(Long.toString(n, mBase));
    mSb.insert(0, mRb.reverse());
    return new Z(mSb.toString(), mBase);
  }

  @Override
  public Z next() {
    do {
      ++mN;
    } while (bump(mN).mod(mN) != 0);
    return Z.valueOf(mN);
  }
}
