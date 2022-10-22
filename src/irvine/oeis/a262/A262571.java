package irvine.oeis.a262;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A262571 Concatenation of the numbers from 2 to n.
 * @author Georg Fischer
 */
public class A262571 extends AbstractSequence {

  private int mN;
  private final int mOmitted;
  private final StringBuilder mSb = new StringBuilder();

  /** Construct the sequence. */
  public A262571() {
    this(2, 1);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param omitted number to be omitted
   */
  public A262571(final int offset, final int omitted) {
    super(offset);
    mN = offset - 1;
    mOmitted = omitted;
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == mOmitted) {
      ++mN;
    }
    mSb.setLength(0);
    for (int i = getOffset(); i <= mN; ++i) {
      if (i != mOmitted) {
        mSb.append(i);
      }
    }
    return new Z(mSb.toString());
  }
}
