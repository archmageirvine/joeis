package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A155982 Decimal expansion of log_12 (24).
 * @author Sean A. Irvine
 */
public class A155982 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155982() {
    super(CR.valueOf(24).log().divide(CR.valueOf(12).log()));
  }
}
