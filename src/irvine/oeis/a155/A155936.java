package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A155936 Decimal expansion of log_4 (24).
 * @author Sean A. Irvine
 */
public class A155936 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155936() {
    super(CR.valueOf(24).log().divide(CR.FOUR.log()));
  }
}
