package irvine.oeis.a005;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A005728 Number of fractions in Farey series of order n.
 * @author Sean A. Irvine
 */
public class A005728 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A005728(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A005728() {
    super(0);
  }

  private Z mA = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.add(Euler.phiAsLong(mN));
    }
    return mA;
  }
}

