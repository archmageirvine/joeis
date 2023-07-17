package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000537 Sum of first n cubes; or n-th triangular number squared.
 * @author Sean A. Irvine
 */
public class A000537 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A000537(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A000537() {
    super(0);
  }

  private long mN = -1;
  private Z mS = Z.ZERO;

  @Override
  public Z next() {
    mS = mS.add(Z.valueOf(++mN).pow(3));
    return mS;
  }
}
