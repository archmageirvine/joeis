package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067820 The start of a record-breaking run of consecutive integers with a number of prime factors (counted with multiplicity) equal to 5.
 * @author Sean A. Irvine
 */
public class A067820 extends Sequence1 {

  private final long mTarget;
  private long mN = 0;
  private long mBest = 0;

  protected A067820(final long target) {
    mTarget = target;
  }

  /** Construct the sequence. */
  public A067820() {
    this(5);
  }

  @Override
  public Z next() {
    while (true) {
      long cnt = 0;
      while (Functions.BIG_OMEGA.l(++mN) == mTarget) {
        ++cnt;
      }
      if (cnt > mBest) {
        mBest = cnt;
        return Z.valueOf(mN - cnt);
      }
    }
  }
}
