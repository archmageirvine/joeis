package irvine.oeis.a068;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000217;

/**
 * A068642 Index of the smallest n-digit palindromic triangular number, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A068642 extends Sequence1 {

  private Z mLim = Z.ONE;
  private final Sequence mSeq = new A000217().skip();
  private Z mA = mSeq.next();

  private long mM = 1;

  @Override
  public Z next() {
    while (mA.compareTo(mLim) < 0) {
      do {
        mA = mSeq.next();
        ++mM;
      } while (!Predicates.PALINDROME.is(10, mA));
    }
    mLim = mLim.multiply(10);
    return mA.compareTo(mLim) >= 0 ? Z.ZERO : Z.valueOf(mM);
  }
}
