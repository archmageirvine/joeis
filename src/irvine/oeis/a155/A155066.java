package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A155066 Decimal expansion of log_14 (19).
 * @author Sean A. Irvine
 */
public class A155066 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155066() {
    super(CR.valueOf(19).log().divide(CR.valueOf(14).log()));
  }
}
