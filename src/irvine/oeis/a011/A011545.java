package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A011545 a(n) is the integer whose decimal digits are the first n+1 decimal digits of Pi.
 * @author Sean A. Irvine
 */
public class A011545 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A011545(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A011545() {
    super(0);
  }

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(10);
    return CR.PI.multiply(mA).floor();
  }
}
