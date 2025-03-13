package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075904 Numbers k such that k^4 has k as a substring of its decimal expansion.
 * @author Sean A. Irvine
 */
public class A075904 extends Sequence1 {

  private long mN = -1;
  private long mM = 10;
  private final long mPower;

  protected A075904(final long power) {
    mPower = power;
  }

  /** Construct the sequence. */
  public A075904() {
    this(4);
  }

  private boolean is(Z k) {
    while (k.compareTo(mN) >= 0) {
      if (k.mod(mM) == mN) {
        return true;
      }
      k = k.divide(10);
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      if (++mN == mM) {
        mM *= 10;
      }
      if (is(Z.valueOf(mN).pow(mPower))) {
        return Z.valueOf(mN);
      }
    }
  }
}
