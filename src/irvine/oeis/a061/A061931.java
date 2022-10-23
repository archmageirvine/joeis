package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061931 Numbers n such that n divides the (right) concatenation of all numbers &lt;= n written in base 2 (most significant digit on right).
 * @author Sean A. Irvine
 * @author Georg Fischer
 */
public class A061931 extends Sequence1 {

  private int mBase;
  private long mN;
  private final StringBuilder mSb;

  /** Construct the sequence. */
  public A061931() {
    this(2);
  }

  /**
   * Generic constructor with parameter.
   * @param base number base
   */
  public A061931(final int base) {
    mBase = base;
    mN = 0;
    mSb = new StringBuilder();
  }

  private Z bump(final long n) {
    final String v = Long.toString(n, mBase);
    int k = v.length() - 1;
    while (v.charAt(k) == '0') {
      --k;
    }
    while (k >= 0) {
      mSb.append(v.charAt(k--));
    }
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
