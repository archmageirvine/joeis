package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A002538 Second-order Eulerian numbers &lt;&lt;n+1,n-1&gt;&gt;.
 * @author Sean A. Irvine
 */
public class A002538 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A002538(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A002538() {
    super(1);
  }

  private Z mA = Z.ZERO;
  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    mA = mA.multiply(mN + 2).add(mF.multiply(mN));
    return mA;
  }
}
