package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A038502 Remove 3's from n.
 * @author Sean A. Irvine
 */
public class A038502 extends AbstractSequence implements DirectSequence {

  private int mN;
  private Z mBase;
  private int mBaseInt;

  /** Construct the sequence. */
  public A038502() {
    this(1, 3);
  }

  /**
   * Generic constructor with default offset.
   * @param offset first index
   * @param base take the power of this parameter
   */
  public A038502(final int base) {
    this(1, base);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param base take the power of this parameter
   */
  public A038502(final int offset, final int base) {
    super(offset);
    mN = offset - 1;
    mBase = Z.valueOf(base);
    mBaseInt = base;
  }

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    if (n.isZero()) {
      return n;
    }
    Z m = n;
    Z[] quot = m.divideAndRemainder(mBase);
    while (quot[1].isZero()) {
      m = quot[0];
      quot = m.divideAndRemainder(mBase);
    }
    return m;
  }

  @Override
  public Z a(final int n) {
    if (n == 0) {
      return Z.ZERO;
    }
    int m = n;
    while (m % mBaseInt == 0) {
      m /= mBaseInt;
    }
    return Z.valueOf(m);
  }

}
