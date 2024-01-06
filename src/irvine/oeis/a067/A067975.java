package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A067975 a(n+1) is the smallest number &gt; a(n) such that the digits of a(n)^2 are all (with multiplicity) contained in the digits of a(n+1)^2, with a(0)=2.
 * @author Sean A. Irvine
 */
public class A067975 extends Sequence0 {

  private Z mA = null;
  private final Z mStart;

  protected A067975(final Z start) {
    mStart = start;
  }

  /** Construct the sequence. */
  public A067975() {
    this(Z.TWO);
  }

  private boolean is(final int[] a, final int[] b) {
    for (int k = 0; k < a.length; ++k) {
      if (a[k] > b[k]) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    if (mA == null) {
      mA = mStart;
      return mStart;
    }
    final int[] cnts = ZUtils.digitCounts(mA.square());
    while (true) {
      mA = mA.add(1);
      final int[] d = ZUtils.digitCounts(mA.square());
      if (is(cnts, d)) {
        return mA;
      }
    }
  }
}
