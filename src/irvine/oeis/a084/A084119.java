package irvine.oeis.a084;

import irvine.math.cr.CR;
import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A084119 Decimal expansion of the Fibonacci binary number, Sum_{k&gt;0} 1/2^F(k), where F(k) = A000045(k).
 * @author Sean A. Irvine
 */
public class A084119 extends DecimalExpansionSequence {

  private static final long PRECISION = 1 << 18; // 18-bits of headroom
  private CR mSum = CR.ZERO;
  private int mPrev = 0;
  private int mK = 0;
  private long mUpdateNumber = 0;


  private void updateSum() {
    ++mUpdateNumber;
    while (PRECISION * mUpdateNumber > mPrev) {
      mPrev = Fibonacci.fibonacci(++mK).intValueExact();
      mSum = mSum.add(CR.valueOf(Z.ONE.shiftLeft(mPrev)).inverse());
    }
  }

  @Override
  protected CR getCR() {
    updateSum();
    return mSum;
  }
}
