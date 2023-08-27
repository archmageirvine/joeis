package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A065297 a(n+1) is the smallest number &gt; a(n) such that the digits of a(n)^2 are all (with multiplicity) properly contained in the digits of a(n+1)^2, with a(0)=1.
 * @author Sean A. Irvine
 */
public class A065297 extends Sequence0 {

  private Z mA = null;
  private final Z mStart;

  protected A065297(final Z start) {
    mStart = start;
  }

  /** Construct the sequence. */
  public A065297() {
    this(Z.ONE);
  }

  private boolean is(final int[] a, final int[] b) {
    boolean lessThan = false;
    for (int k = 0; k < a.length; ++k) {
      if (a[k] > b[k]) {
        return false;
      }
      if (a[k] < b[k]) {
        lessThan = true; // i.e., saw evidence of proper containment
      }
    }
    return lessThan;
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
