package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A155781 Decimal expansion of log_15 (22).
 * @author Sean A. Irvine
 */
public class A155781 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155781() {
    super(CR.valueOf(22).log().divide(CR.valueOf(15).log()));
  }
}
