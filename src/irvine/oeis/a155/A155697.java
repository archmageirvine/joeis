package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A155697 Decimal expansion of log_6 (22).
 * @author Sean A. Irvine
 */
public class A155697 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155697() {
    super(CR.valueOf(22).log().divide(CR.SIX.log()));
  }
}
