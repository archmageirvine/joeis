package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A155068 Decimal expansion of log_15 (19).
 * @author Sean A. Irvine
 */
public class A155068 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155068() {
    super(CR.valueOf(19).log().divide(CR.valueOf(15).log()));
  }
}
