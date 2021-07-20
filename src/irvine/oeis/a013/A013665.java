package irvine.oeis.a013;

import irvine.math.cr.Zeta;
import irvine.math.z.Z;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A013665 Decimal expansion of zeta(7).
 * @author Sean A. Irvine
 */
public class A013665 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A013665() {
    super(Zeta.zeta(7));
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
