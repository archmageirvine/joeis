package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A155530 Decimal expansion of log_18 (20).
 * @author Sean A. Irvine
 */
public class A155530 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155530() {
    super(CR.valueOf(20).log().divide(CR.valueOf(18).log()));
  }
}
