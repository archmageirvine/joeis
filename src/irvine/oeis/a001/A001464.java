package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A001464 Expansion of e.g.f. exp(-x - (1/2)*x^2).
 * @author Sean A. Irvine
 */
public class A001464 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A001464(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A001464() {
    super(0);
  }

  private long mN = -2;
  private Z mA = Z.ONE;
  private Z mB = Z.ZERO;

  @Override
  public Z next() {
    final Z t = mB.negate().subtract(mA.multiply(++mN));
    mA = mB;
    mB = t;
    return t;
  }
}
