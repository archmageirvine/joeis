package irvine.oeis.a130;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A130466 Triangle where the n-th row consists of the n smallest positive integers which are coprime to the sum of divisors of n.
 * @author Sean A. Irvine
 */
public class A130466 implements Sequence {

  private int mRow = 0;
  private int mPositionInRow = 0;
  private Z mCurrentSigma = null;
  private long mCurrentIndex = 0;

  @Override
  public Z next() {
    if (mPositionInRow >= mRow) {
      // Starting a new row
      ++mRow;
      mPositionInRow = 0;
      mCurrentSigma = Cheetah.factor(mRow).sigma();
      mCurrentIndex = 0;
    }
    ++mPositionInRow;
    while (true) {
      ++mCurrentIndex;
      final Z t = Z.valueOf(mCurrentIndex);
      if (Z.ONE.equals(mCurrentSigma.gcd(t))) {
        return t;
      }
    }
  }
}

