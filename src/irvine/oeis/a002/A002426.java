package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A002426 Central trinomial coefficients: largest coefficient of (1 + x + x^2)^n.
 * @author Sean A. Irvine
 */
public class A002426 extends AbstractSequence {

  /** Construct the sequence. */
  public A002426() {
    super(0);
  }

  protected long mN = -1;
  private Z mA = Z.ONE;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      final Z t = mB.multiply(2 * mN - 1).add(mA.multiply(3).multiply(mN - 1)).divide(mN);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
