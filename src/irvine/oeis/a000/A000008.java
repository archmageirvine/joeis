package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000008 Number of ways of making change for n cents using coins of <code>1, 2, 5, 10</code> cents.
 * @author Sean A. Irvine
 */
public class A000008 implements Sequence {

  final Z[] mA = new Z[18];
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
      .add(get(2))
      .add(get(5))
      .subtract(get(7))
      .add(get(10))
      .subtract(get(12))
      .subtract(get(15))
      .add(get(17));
    mA[mHead++] = r;
    if (mHead == mA.length) {
      mHead = 0;
    }
    return r;
  }
}

