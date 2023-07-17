package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A001608 Perrin sequence (or Ondrej Such sequence): a(n) = a(n-2) + a(n-3) with a(0) = 3, a(1) = 0, a(2) = 2.
 * @author Sean A. Irvine
 */
public class A001608 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A001608(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A001608() {
    super(0);
  }

  private Z mA = Z.TWO;
  private Z mB = Z.ONE;
  private Z mC = Z.NEG_ONE;

  @Override
  public Z next() {
    final Z t = mA.add(mB);
    mA = mB;
    mB = mC;
    mC = t;
    return t;
  }
}
