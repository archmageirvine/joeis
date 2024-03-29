package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A003095 a(n) = a(n-1)^2 + 1 for n &gt;= 1, with a(0) = 0.
 * @author Sean A. Irvine
 */
public class A003095 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A003095(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A003095() {
    super(0);
  }

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ZERO : mA.square().add(1);
    return mA;
  }
}
