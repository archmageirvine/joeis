package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A054055 Largest digit of n.
 * @author Sean A. Irvine
 */
public class A054055 extends AbstractSequence implements DirectSequence {

  private int mN;
  private final int mBase;

  /** Construct the sequence. */
  public A054055() {
    this(10);
  }

  /**
   * Generic constructor with parameter.
   * @param base number base
   */
  public A054055(final int base) {
    super(0);
    mBase = base;
    mN = -1;
  }

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    Z m = n;
    long max = 0;
    while (!m.isZero() && max != mBase - 1) {
      final long r = m.mod(mBase);
      m = m.divide(mBase);
      if (r > max) {
        max = r;
      }
    }
    return Z.valueOf(max);
  }

  @Override
  public Z a(final int n) {
    int m = n;
    int max = 0;
    while (m != 0 && max != mBase - 1) {
      final int r = m % mBase;
      m /= mBase;
      if (r > max) {
        max = r;
      }
    }
    return Z.valueOf(max);
  }

}
