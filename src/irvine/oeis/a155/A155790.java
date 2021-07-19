package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155790 Decimal expansion of log_21 (22).
 * @author Sean A. Irvine
 */
public class A155790 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155790() {
    super(CR.valueOf(22).log().divide(CR.valueOf(21).log()));
  }
}
