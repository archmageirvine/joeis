package irvine.oeis.a068;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000217;

/**
 * A068644 Index of the largest n-digit palindromic triangular number, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A068644 extends Sequence1 {

  private final Sequence mSeq = new A000217().skip();
  private Z mA = mSeq.next();
  private Z mLim = Z.ONE;

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
      } while (!Predicates.PALINDROME.is(10, mA));
    }
    return t == mM ? Z.ZERO : Z.valueOf(t);
  }
}
