package irvine.oeis.a013;

import irvine.math.cr.Zeta;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A013673 Decimal expansion of zeta(15).
 * @author Sean A. Irvine
 */
public class A013673 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A013673() {
    super(Zeta.zeta(15));
  }
}
