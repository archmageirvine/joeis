package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000217;

/**
 * A068644 Index of the largest n-digit palindromic triangular number, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A068644 extends AbstractSequence {

  private Z mA;
  private final A000217 mSeq = new A000217();
  private Z mLim = Z.ONE;

  public A068644() {
    super(1);
    mSeq.next(); // skip 0
    mA = mSeq.next();
  }

  private long mM = 1;

  @Override
  public Z next() {
    mLim = mLim.multiply(10);
    long t = mM;
    while (mA.compareTo(mLim) < 0) {
      t = mM;
      do {
        mA = mSeq.next();
        ++mM;
      } while (!ZUtils.isPalindrome(mA, 10));
    }
    return t == mM ? Z.ZERO : Z.valueOf(t);
  }
}
