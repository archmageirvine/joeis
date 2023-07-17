package irvine.oeis.a001;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A001233 Unsigned Stirling numbers of first kind s(n,6).
 * @author Sean A. Irvine
 */
public class A001233 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A001233(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A001233() {
    super(6);
  }

  private long mN = 5;

  @Override
  public Z next() {
    return Stirling.firstKind(++mN, 6).abs();
  }
}
