package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A155782 Decimal expansion of log_16 (22).
 * @author Sean A. Irvine
 */
public class A155782 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155782() {
    super(CR.valueOf(22).log().divide(CR.valueOf(16).log()));
  }
}
