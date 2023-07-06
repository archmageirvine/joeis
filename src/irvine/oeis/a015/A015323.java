package irvine.oeis.a015;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A015323 Gaussian binomial coefficient [ n,6 ] for q = -2.
 * @author Sean A. Irvine
 */
public class A015323 extends AbstractSequence {

  private int mN; // current index
  private int mP;
  private int mQ;

  /** Construct the sequence. */
  public A015323() {
    this(6, 6, -2);
  }

  /**
   * Generic constructor with offset, p and q.
   * @param offset first index of subclass
   * @param p
   * @param q
   */
  public A015323(final int offset, final int p, final int q) {
    super(offset);
    mN = offset - 1;
    mP = p;
    mQ = q;
  }

  @Override
  public Z next() {
    return Binomial.gaussianBinomial(++mN, mP, mQ);
  }
}
