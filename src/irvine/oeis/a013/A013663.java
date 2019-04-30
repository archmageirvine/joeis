package irvine.oeis.a013;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.math.z.Z;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A013663 Decimal expansion of <code>zeta(5)</code>.
 * @author Sean A. Irvine
 */
public class A013663 extends DecimalExpansionSequence {

  private static final CR N = Zeta.zeta(5);

  @Override
  protected CR getCR() {
    return N;
  }

  @Override
  public Z next() {
    if (mN == 400) {
      // Comparison with known values suggests insufficient accuracy beyond n=418
      // Note more accuracy is available but would need to change call to Zeta.zeta
      throw new UnsupportedOperationException("Accuracy problem");
    }
    return super.next();
  }
}
