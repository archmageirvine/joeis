package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A155554 Decimal expansion of log_6 (21).
 * @author Sean A. Irvine
 */
public class A155554 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155554() {
    super(CR.valueOf(21).log().divide(CR.SIX.log()));
  }
}
