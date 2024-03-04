package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A068664 a(1) = 1, a(n) = smallest palindromic multiple of a(n-1).
 * @author Sean A. Irvine
 */
public class A068664 extends Sequence1 {

  private final Z mStart;
  private Z mA = null;

  protected A068664(final Z start) {
    mStart = start;
  }

  /** Construct the sequence. */
  public A068664() {
    this(Z.ONE);
  }

  @Override
  public Z next() {
    if (mA == null) {
      mA = mStart;
    } else {
      Z t = mA;
      do {
        t = t.add(mA);
      } while (!ZUtils.isPalindrome(t, 10));
      mA = t;
    }
    return mA;
  }
}
