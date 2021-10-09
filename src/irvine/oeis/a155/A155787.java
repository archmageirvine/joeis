package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A155787 Decimal expansion of log_19 (22).
 * @author Sean A. Irvine
 */
public class A155787 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155787() {
    super(CR.valueOf(22).log().divide(CR.valueOf(19).log()));
  }
}
