package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A155824 Decimal expansion of log_7(23).
 * @author Sean A. Irvine
 */
public class A155824 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155824() {
    super(CR.valueOf(23).log().divide(CR.SEVEN.log()));
  }
}
