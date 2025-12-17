package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082620 a(1) = 1, then the smallest palindromic prime obtained by inserting digits anywhere in a(n-1).
 * @author Sean A. Irvine
 */
public class A082620 extends Sequence1 {

  private final Z mStart;
  private Z mA = null;

  protected A082620(final Z start) {
    mStart = start;
  }

  /** Construct the sequence. */
  public A082620() {
    this(Z.ONE);
  }

  @Override
  public Z next() {
    if (mA == null) {
      mA = mStart;
      return mA;
    }
    if (mA.isOne()) {
      mA = Z.valueOf(11);
      return mA;
    }
    final String s = mA.toString();
    if ((s.length() & 1) == 0) {
      // even length, try another digit in the middle
      for (int d = 0; d < 10; ++d) {
        final Z t = new Z(s.substring(0, s.length() / 2) + d + s.substring(s.length() / 2));
        if (t.isProbablePrime()) {
          mA = t;
          return t;
        }
      }
    } else {
      // Try inserting a pairs of identical digits at all symmetric locations
      Z min = null;
      for (int pos = 0; 2 * pos <= s.length(); ++pos) {
        for (int d = pos == 0 ? 1 : 0; d < 10; ++d) {
          final Z t = new Z(s.substring(0, pos) + d + s.substring(pos, s.length() - pos) + d + s.substring(s.length() - pos));
          if ((min == null || t.compareTo(min) < 0) && t.isProbablePrime()) {
            min = t;
          }
        }
      }
      // Try inserting a combination in the middle
      for (int d = 0; d < 10; ++d) {
        final int mid = (s.length() + 1) / 2;
        final Z t = new Z(s.substring(0, mid) + d + s.charAt(mid - 1) + s.substring(mid));
        if ((min == null || t.compareTo(min) < 0) && t.isProbablePrime()) {
          min = t;
        }
      }
      if (min != null) {
        mA = min;
        return mA;
      }
    }
    throw new UnsupportedOperationException();
  }
}
