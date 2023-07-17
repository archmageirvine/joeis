package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A001405 a(n) = binomial(n, floor(n/2)).
 * @author Sean A. Irvine
 */
public class A001405 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A001405(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A001405() {
    super(0);
  }

  private long mN = -1;
  private Z mA = Z.ONE;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    if (++mN >= 2) {
      final Z t = mB.multiply2().add(mA.multiply(mN - 1).shiftLeft(2)).divide(mN + 1);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
