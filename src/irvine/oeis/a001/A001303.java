package irvine.oeis.a001;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A001303 Stirling numbers of first kind, s(n+3, n), negated.
 * @author Sean A. Irvine
 */
public class A001303 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A001303(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A001303() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Stirling.firstKind(mN + 3, mN).negate();
  }
}
