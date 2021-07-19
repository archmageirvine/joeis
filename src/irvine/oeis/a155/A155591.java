package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155591 Decimal expansion of log_7(21).
 * @author Sean A. Irvine
 */
public class A155591 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155591() {
    super(CR.valueOf(21).log().divide(CR.SEVEN.log()));
  }
}
