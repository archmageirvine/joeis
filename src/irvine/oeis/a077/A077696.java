package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.AbstractSequence;

/**
 * A077696 a(0) = 2; a(n) = smallest multiple of a(n-1), not a multiple of 10, that contains all the digits of a(n-1).
 * @author Sean A. Irvine
 */
public class A077696 extends AbstractSequence {

  private final Z mStart;
  private Z mA = null;

  protected A077696(final int offset, final Z start) {
    super(offset);
    mStart = start;
  }

  /** Construct the sequence. */
  public A077696() {
    this(0, Z.TWO);
  }

  static boolean is(final int[] a, final int[] b) {
    for (int k = 0; k < a.length; ++k) {
      if (b[k] < a[k]) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    if (mA == null) {
      mA = mStart;
    } else {
      final int[] cnts = ZUtils.digitCounts(mA);
      Z m = mA;
      while (true) {
        m = m.add(mA);
        if (m.mod(10) != 0) {
          final int[] c = ZUtils.digitCounts(m);
          if (is(cnts, c)) {
            mA = m;
            break;
          }
        }
      }
    }
    return mA;
  }
}
