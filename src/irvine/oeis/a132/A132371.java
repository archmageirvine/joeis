package irvine.oeis.a132;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A132371 a(n) = n! - Sum_{j=1..n-1} j!.
 * @author Georg Fischer
 */
public class A132371 extends Sequence1 {

  private int mN;
  private Z mFact;
  private Z mSum;

  /** Construct the sequence. */
  public A132371() {
    mN = 0;
    mSum = Z.ZERO;
    mFact = Z.ONE;
  }

  @Override
  public Z next() {
    ++mN;
    mFact = mFact.multiply(mN);
    final Z result = mFact.subtract(mSum);
    mSum = mSum.add(mFact);
    return result;
  }
}
