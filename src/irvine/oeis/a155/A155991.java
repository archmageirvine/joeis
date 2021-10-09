package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A155991 Decimal expansion of log_16 (24).
 * @author Sean A. Irvine
 */
public class A155991 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155991() {
    super(CR.valueOf(24).log().divide(CR.valueOf(16).log()));
  }
}
