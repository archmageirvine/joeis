package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008905 Leading digit of n!.
 * @author Sean A. Irvine
 */
public class A008905 implements Sequence {

  private Z mF = Z.ONE;
  private long mN = -1;
  private final int mBase;

  /** Construct the sequence. */
  public A008905() {
    this(10);
  }

  /**
   * Generic constructor with parameter
   * @param base number base
   */
  public A008905(final int base) {
    mBase = base;
  }

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
      if (mBase == 10) {
        Z[] qr;
        while ((qr = mF.divideAndRemainder(Z.TEN))[1].isZero()) {
          mF = qr[0];
        }
      }
    }
    final char ch = mF.toString(mBase).charAt(0);
    return Z.valueOf(ch >= 'a' ? ch - 'a' + 10 : ch - '0');
  }
}
