package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000217;

/**
 * A068642 Index of the smallest n-digit palindromic triangular number, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A068642 extends AbstractSequence {

  private Z mLim = Z.ONE;
  private Z mA;
  private final A000217 mSeq = new A000217();

  public A068642() {
    super(1);
    mSeq.next(); // skip 0
    mA = mSeq.next();
  }

  private long mM = 1;

  @Override
  public Z next() {
    while (mA.compareTo(mLim) < 0) {
      do {
        mA = mSeq.next();
        ++mM;
      } while (!ZUtils.isPalindrome(mA, 10));
    }
    mLim = mLim.multiply(10);
    return mA.compareTo(mLim) >= 0 ? Z.ZERO : Z.valueOf(mM);
  }
}
