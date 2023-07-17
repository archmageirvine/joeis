package irvine.oeis.a094;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A094040 Triangle read by rows: T(n,k) is the number of noncrossing forests with n vertices and k edges.
 * @author Sean A. Irvine
 */
public class A094040 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A094040(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A094040() {
    super(1);
  }

  private long mN = 0;
  private long mM = 0;

  protected Z t(final long n, final long m) {
    return Binomial.binomial(n, m + 1).multiply(Binomial.binomial(n + 2 * m - 1, m)).divide(n + m);
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return t(mN, mM);
  }
}
