package irvine.oeis.a013;

import irvine.math.cr.Zeta;
import irvine.math.z.Z;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A013663 Decimal expansion of zeta(5).
 * @author Sean A. Irvine
 */
public class A013663 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A013663() {
    super(Zeta.zeta(5));
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
