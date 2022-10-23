package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000064 Partial sums of (unordered) ways of making change for n cents using coins of 1, 2, 5, 10 cents.
 * @author Sean A. Irvine
 */
public class A000064 extends Sequence0 {

  final Z[] mA = new Z[19];
  int mHead = 0;

  private Z get(final int p) {
    int n = mHead - p;
    if (n < 0) {
      n += mA.length;
    }
    return mA[n] == null ? Z.ZERO : mA[n];
  }

  @Override
  public Z next() {
    final Z r = Z.ONE
      .add(get(1))
      .add(get(2))
      .add(get(5))
      .add(get(10))
      .subtract(get(3))
      .subtract(get(6))
      .subtract(get(7))
      .subtract(get(11))
      .subtract(get(12))
      .subtract(get(15))
      .add(get(8))
      .add(get(13))
      .add(get(16))
      .add(get(17))
      .subtract(get(18));
    mA[mHead++] = r;
    if (mHead == mA.length) {
      mHead = 0;
    }
    return r;
  }
}

