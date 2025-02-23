package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A001824 Central factorial numbers: 1st subdiagonal of A008956.
 * @author Sean A. Irvine
 */
public class A001824 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A001824(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A001824() {
    super(0);
  }

  private long mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    ++mN;
    mF = mF.multiply(Z.valueOf(2 * mN + 1).square());
    Z s = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      s = s.add(mF.divide(Z.valueOf(2 * k + 1).square()));
    }
    return s;
  }
}
