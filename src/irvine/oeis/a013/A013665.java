package irvine.oeis.a013;

import irvine.math.cr.Zeta;
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
}
