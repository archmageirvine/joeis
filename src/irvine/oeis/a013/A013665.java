package irvine.oeis.a013;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.math.z.Z;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A013665 Decimal expansion of zeta(7).
 * @author Sean A. Irvine
 */
public class A013665 extends DecimalExpansionSequence {

  private static final CR N = Zeta.zeta(7);

  @Override
  protected CR getCR() {
    return N;
  }

  @Override
  public Z next() {
    if (mN == 400) {
      // Known to be correct to 400 decimal places. Cf. A013663.
      throw new UnsupportedOperationException("Accuracy problem");
    }
    return super.next();
  }
}
