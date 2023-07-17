package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A004201 Accept one, reject one, accept two, reject two, ...
 * @author Sean A. Irvine
 */
public class A004201 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A004201(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A004201() {
    super(1);
  }

  private Z mA = Z.ZERO;
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (--mM <= 0) {
      mA = mA.add(mN++);
      mM = mN;
    }
    mA = mA.add(1);
    return mA;
  }
}
