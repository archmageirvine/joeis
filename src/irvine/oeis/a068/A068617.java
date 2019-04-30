package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A068617 Starting from <code>a(1)=8</code>, each subsequent term is the minimal square obtained by inserting at least one digit in the previous term.
 * @author Sean A. Irvine
 */
public class A068617 implements Sequence {

  private final String mStart;
  private String mCurrent = null;

  A068617(final String start) {
    mStart = start;
  }

  /** Construct the sequence. */
  public A068617() {
    this("8");
  }

  private boolean test(final String s) {
    final int clen = mCurrent.length();
    if (s.length() <= clen) {
      return false;
    }
    for (int cp = 0, sp = 0; sp < s.length(); ++sp) {
      if (s.charAt(sp) == mCurrent.charAt(cp)) {
        if (++cp == clen) {
          return true;
        }
      }
    }
    return false;
  }

  @Override
  public Z next() {
    if (mCurrent == null) {
      mCurrent = mStart;
      return new Z(mCurrent);
    }
    Z n = new Z(mCurrent).sqrt();
    while (true) {
      n = n.add(1);
      final Z s = n.square();
      final String ss = s.toString();
      if (test(ss)) {
        mCurrent = ss;
        return s;
      }
    }
  }
}

