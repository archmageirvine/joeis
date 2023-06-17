package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A031941 Numbers without consecutive equal base 3 digits.
 * @author Sean A. Irvine
 */
public class A031941 extends AbstractSequence {

  private final long mBase;
  private long mN;

  protected A031941(final long base, final long start) {
    super(1);
    mBase = base;
    mN = start - 1;
  }

  /** Construct the sequence. */
  public A031941() {
    this(3, 1);
  }

  private boolean isConecutiveDigits(long n) {
    long r = -1;
    while (n != 0) {
      final long t = n % mBase;
      n /= mBase;
      if (t == r) {
        return true;
      }
      r = t;
    }
    return false;
  }

  @Override
  public Z next() {
    while (isConecutiveDigits(++mN)) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
