package irvine.oeis.a084;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A084546 Triangle read by rows: T(n,k) = C( C(n,2), k) for n &gt;= 0, 0 &lt;= k &lt;= C(n,2).
 * @author Sean A. Irvine
 */
public class A084546 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A084546(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A084546() {
    super(0);
  }

  private int mN = 0;
  private int mM = -1;

  protected Z t(final int n, final int m) {
    return Binomial.binomial((long) n * (n - 1) / 2, m);
  }

  @Override
  public Z next() {
    if (++mM > mN * (mN - 1) / 2) {
      ++mN;
      mM = 0;
    }
    return t(mN, mM);
  }
}

