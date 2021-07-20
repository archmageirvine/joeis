package irvine.oeis.a013;

import irvine.math.cr.Zeta;
import irvine.math.z.Z;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A013667 Decimal expansion of zeta(9).
 * @author Sean A. Irvine
 */
public class A013667 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A013667() {
    super(Zeta.zeta(9));
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
