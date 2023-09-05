package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A065524 The (5^n)-th composite number.
 * @author Sean A. Irvine
 */
public class A065524 extends A002808 {

  private final long mBase;
  private long mTarget = 0;
  private long mN = 0;

  protected A065524(final int offset, final int base) {
    mBase = base;
    setOffset(offset);
  }

  /** Construct the sequence. */
  public A065524() {
    this(0, 5);
  }

  @Override
  public Z next() {
    mTarget = mTarget == 0 ? 1 : mTarget * mBase;
    while (true) {
      final Z c = super.next();
      if (++mN == mTarget) {
        return c;
      }
    }
  }
}
