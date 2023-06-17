package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A048841 Least positive integer k for which 11^n divides k!.
 * @author Sean A. Irvine
 */
public class A048841 extends AbstractSequence {

  private final long mTarget;
  private long mN = -1;
  private long mM = 1;
  private long mCount = 0;

  protected A048841(final int target) {
    super(0);
    mTarget = target;
  }

  /** Construct the sequence. */
  public A048841() {
    this(11);
  }

  @Override
  public Z next() {
    ++mN;
    while (true) {
      if (mCount >= mN) {
        return Z.valueOf(mM);
      }
      long m = ++mM;
      while ((m % mTarget) == 0) {
        ++mCount;
        m /= mTarget;
      }
    }
  }
}
