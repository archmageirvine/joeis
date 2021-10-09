package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A155686 Decimal expansion of log_19 (21).
 * @author Sean A. Irvine
 */
public class A155686 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155686() {
    super(CR.valueOf(21).log().divide(CR.valueOf(19).log()));
  }
}
