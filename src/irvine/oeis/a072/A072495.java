package irvine.oeis.a072;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072106.
 * @author Sean A. Irvine
 */
public class A072495 extends Sequence1 {

  private final long mPower;
  private long mN = -1;
  private long mM = 10;

  protected A072495(final long power) {
    mPower = power;
  }

  /** Construct the sequence. */
  public A072495() {
    this(21);
  }

  @Override
  public Z next() {
    while (true) {
      if (++mN == mM) {
        mM *= 10;
      }
      if (LongUtils.modPow(mN, mPower, mM) == mN) {
        return Z.valueOf(mN);
      }
    }
  }
}
