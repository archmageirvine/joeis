package irvine.oeis.a007;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A007404 Decimal expansion of <code>Sum_{n&gt;=0} 1/2^(2^n)</code>.
 * @author Sean A. Irvine
 */
public class A007404 extends DecimalExpansionSequence {

  private CR mA = CR.HALF;

  {
    for (int k = 1; k < 31; ++k) {
      mA = mA.add(CR.valueOf(Z.ONE.shiftLeft(1 << k)).inverse());
    }
  }

  @Override
  protected CR getCR() {
    return mA;
  }
}
