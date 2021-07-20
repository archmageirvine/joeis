package irvine.oeis.a013;

import irvine.math.cr.Zeta;
import irvine.math.z.Z;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A013677 Decimal expansion of zeta(19).
 * @author Sean A. Irvine
 */
public class A013677 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A013677() {
    super(Zeta.zeta(19));
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
