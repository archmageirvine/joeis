package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A155165 Decimal expansion of log_22 (19).
 * @author Sean A. Irvine
 */
public class A155165 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155165() {
    super(0, CR.valueOf(19).log().divide(CR.valueOf(22).log()));
  }
}
