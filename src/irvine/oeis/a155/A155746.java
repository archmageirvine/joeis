package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A155746 Decimal expansion of log_10 (22).
 * @author Sean A. Irvine
 */
public class A155746 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155746() {
    super(CR.valueOf(22).log().divide(CR.LOG10));
  }
}
