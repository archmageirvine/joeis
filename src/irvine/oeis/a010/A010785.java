package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.util.string.StringUtils;

/**
 * A010785 Repdigit numbers, or numbers whose digits are all equal.
 * @author Sean A. Irvine
 */
public class A010785 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A010785(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A010785() {
    super(0);
  }

  private char mN = '/';
  private int mLength = 1;

  @Override
  public Z next() {
    if (++mN > '9') {
      ++mLength;
      mN = '1';
    }
    return new Z(StringUtils.rep(mN, mLength));
  }
}
