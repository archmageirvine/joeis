package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A155522 Decimal expansion of log_10 (20).
 * @author Sean A. Irvine
 */
public class A155522 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155522() {
    super(CR.valueOf(20).log().divide(CR.TEN.log()));
  }
}
