package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A061511 a(0) = 0; a(n) is obtained by incrementing each digit of a(n-1) by 1.
 * @author Georg Fischer
 */
public class A061511 extends Sequence0 {

  private Z mA0;
  private int mIncr;
  private StringBuilder mSb;

  /** Construct the sequence. */
  public A061511() {
    this(0, 1);
  }

  /**
   * Generic constructor with parameters
   * @param a0 first term
   * @param incr increment for digits
   */
  public A061511(final int a0, final int incr) {
    mA0 = Z.valueOf(a0);
    mIncr = incr;
    mSb = new StringBuilder(128);
  }

  @Override
  public Z next() {
    final Z result = mA0;
    mSb.setLength(0);
    final String sa = mA0.toString();
    final int sal = sa.length();
    for (int pos = 0; pos < sal; ++pos) {
      mSb.append(String.valueOf(sa.charAt(pos) - '0' + mIncr));
    }
    mA0 = new Z(mSb.toString());
    return result;
  }
}
