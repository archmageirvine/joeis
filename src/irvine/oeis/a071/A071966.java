package irvine.oeis.a071;

import java.util.TreeSet;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001481;
import irvine.oeis.a002.A002808;

/**
 * A071966 Composite numbers such that smallest prime factor, largest prime factor and sum of prime factors (with repetition) are all a sum of two squares.
 * @author Sean A. Irvine
 */
public class A071966 extends A002808 {

  private final Sequence mA = new A001481();
  private final TreeSet<Z> mSumOfSquares = new TreeSet<>();
  {
    mSumOfSquares.add(mA.next()); // avoid isEmpty checks later
  }

  private boolean isSumOfSquares(final Z n) {
    while (n.compareTo(mSumOfSquares.last()) > 0) {
      mSumOfSquares.add(mA.next());
    }
    return mSumOfSquares.contains(n);
  }

  @Override
  public Z next() {
    while (true) {
      final Z c = super.next();
      final FactorSequence fs = Jaguar.factor(c);
      if (isSumOfSquares(fs.leastPrimeFactor()) && isSumOfSquares(fs.largestPrimeFactor()) && isSumOfSquares(fs.sopfr())) {
        return c;
      }
    }
  }
}
