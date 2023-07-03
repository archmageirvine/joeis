package irvine.oeis.a061;
// manually 2021-07-05

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A061038 Denominator of 1/4 - 1/n^2.
 * @author Georg Fischer
 */
public class A061038 extends AbstractSequence {

  protected int mN;
  protected Q mAdd;

  /** Construct the sequence. */
  public A061038() {
    this(2, 4);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param parm parameter
   */
  public A061038(final int offset, final int parm) {
    super(offset);
    mN = offset - 1;
    mAdd = new Q(Z.ONE, Z.valueOf(parm));
  }

  @Override
  public Z next() {
    ++mN;
    return (mAdd.subtract(new Q(Z.ONE, Z.valueOf(mN).square()))).den();
  }
}
