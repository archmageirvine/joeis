package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A155524 Decimal expansion of log_12 (20).
 * @author Sean A. Irvine
 */
public class A155524 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155524() {
    super(CR.valueOf(20).log().divide(CR.valueOf(12).log()));
  }
}
