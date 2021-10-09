package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A155677 Decimal expansion of log_10 (21).
 * @author Sean A. Irvine
 */
public class A155677 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155677() {
    super(CR.valueOf(21).log().divide(CR.TEN.log()));
  }
}
