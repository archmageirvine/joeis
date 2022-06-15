package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054055 Largest digit of n.
 * @author Sean A. Irvine
 */
public class A054055 implements Sequence {

  private long mN = -1;
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
    mBase = base;
  }

  @Override
  public Z next() {
    long m = ++mN;
    long max = 0;
    while (m != 0 && max != mBase - 1) {
      final long r = m % mBase;
      m /= mBase;
      if (r > max) {
        max = r;
      }
    }
    return Z.valueOf(max);
  }
}
