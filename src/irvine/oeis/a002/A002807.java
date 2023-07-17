package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A002807 a(n) = Sum_{k=3..n} (k-1)!*C(n,k)/2.
 * @author Sean A. Irvine
 */
public class A002807 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A002807(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A002807() {
    super(0);
  }

  private long mN = -1;
  private Z mA = Z.ZERO;
  private Z mB = Z.ZERO;

  @Override
  public Z next() {
    if (++mN > 2) {
      final Z t = mB.multiply(mN).subtract(mA.multiply(mN - 1)).add(Z.valueOf(mN - 1).multiply(mN - 2).divide2());
      mA = mB;
      mB = t;
    }
    return mB;
  }
}

