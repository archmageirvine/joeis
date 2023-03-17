package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062052 Numbers with 2 odd integers in their Collatz (or 3x+1) trajectory.
 * @author Sean A. Irvine
 */
public class A062052 extends Sequence1 {

  private long mN = 1;
  private final long mTarget;

  protected A062052(final long target) {
    mTarget = target;
  }

  /** Construct the sequence. */
  public A062052() {
    this(2);
  }

  private boolean is(final long n) {
    Z m = Z.valueOf(n);
    long cnt = 0;
    while (true) {
      m = m.makeOdd();
      if (++cnt > mTarget) {
        return false;
      }
      if (Z.ONE.equals(m)) {
        break;
      }
      m = m.multiply(3).add(1);
    }
    return cnt == mTarget;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

