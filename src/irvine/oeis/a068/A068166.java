package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068166 Define an increasing sequence as follows. Given the first term, called the seed (which need not share the property of the remaining terms), subsequent terms are obtained by inserting at least one digit in the previous term so as to obtain the smallest number with the specified property. This is the prime sequence with the seed a(1) = 1.
 * @author Sean A. Irvine
 */
public class A068166 extends Sequence1 {

  private final Z mStart;
  private Z mA = null;

  protected A068166(final Z start) {
    mStart = start;
  }

  /** Construct the sequence. */
  public A068166() {
    this(Z.ONE);
  }

  private Z search1(final Z n) {
    final String s = n.toString();
    Z min = null;
    for (int k = 0; k <= s.length(); ++k) {
      final String left = s.substring(0, k);
      final String right = s.substring(k);
      for (int digit = k == 0 ? 1 : 0; digit <= 9; ++digit) {
        final String t = left + digit + right;
        final Z v = new Z(t);
        if (v.isProbablePrime() && (min == null || v.compareTo(min) < 0)) {
          min = v;
        }
      }
    }
    return min;
  }

  private Z search2(final Z n) {
    final String s = n.toString();
    Z min = null;
    for (int k = 0; k <= s.length(); ++k) {
      final String left = s.substring(0, k);
      for (int j = k; j <= s.length(); ++j) {
        final String mid = s.substring(k, j);
        final String right = s.substring(j);
        for (int d1 = k == 0 ? 1 : 0; d1 <= 9; ++d1) {
          for (int d2 = 0; d2 <= 9; ++d2) {
            final String t = left + d1 + mid + d2 + right;
            final Z v = new Z(t);
            if (v.isProbablePrime() && (min == null || v.compareTo(min) < 0)) {
              min = v;
            }
          }
        }
      }
    }
    return min;
  }

  @Override
  public Z next() {
    if (mA == null) {
      mA = mStart;
      return mStart;
    } else {
      final Z search1 = search1(mA);
      if (search1 != null) {
        mA = search1;
        return search1;
      }
      final Z search2 = search2(mA);
      if (search2 != null) {
        mA = search2;
        return search2;
      }
    }
    throw new UnsupportedOperationException();
  }
}
