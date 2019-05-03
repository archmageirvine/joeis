package irvine.oeis.a076;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A076214 Decimal expansion of <code>C=sum(k&gt;=0,1/2^(2^k-1))</code>.
 * @author Sean A. Irvine
 */
public class A076214 extends DecimalExpansionSequence {

  private CR mSum = CR.ZERO;
  private int mK = -1;

  private void updateSum() {
    if (mK < 30) {
      mSum = mSum.add(CR.valueOf(Z.ONE.shiftLeft(1 << ++mK)).inverse());
    }
  }

  {
    for (int k = 0; k < 5; ++k) {
      updateSum();
    }
  }

  @Override
  protected CR getCR() {
    updateSum();
    return mSum.multiply(CR.TWO);
  }
}
