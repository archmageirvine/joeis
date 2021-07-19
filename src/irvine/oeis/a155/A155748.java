package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155748 Decimal expansion of log_11 (22).
 * @author Sean A. Irvine
 */
public class A155748 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155748() {
    super(CR.valueOf(22).log().divide(CR.valueOf(11).log()));
  }
}
