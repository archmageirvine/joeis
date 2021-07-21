package irvine.oeis.a013;

import irvine.math.cr.Zeta;
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
}
