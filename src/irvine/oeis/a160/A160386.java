package irvine.oeis.a160;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A160386 Decimal expansion of Sum_{n&gt;=0}(-1)^n/3^(2^n).
 * @author Sean A. Irvine
 */
public class A160386 extends DecimalExpansionSequence {

  private CR mSum = CR.ZERO;
  private int mK = -1;

  private void updateSum() {
    if (mK < 29) {
      mSum = ComputableReals.SINGLETON.signedAdd((++mK & 1) == 0, mSum, CR.valueOf(Z.THREE.pow(1 << mK)).inverse());
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
    return mSum;
  }
}
