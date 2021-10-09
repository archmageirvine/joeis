package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A155064 Decimal expansion of log_12 (19).
 * @author Sean A. Irvine
 */
public class A155064 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155064() {
    super(CR.valueOf(19).log().divide(CR.valueOf(12).log()));
  }
}
