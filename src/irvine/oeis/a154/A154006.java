package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154006 Decimal expansion of log_23 (8).
 * @author Sean A. Irvine
 */
public class A154006 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154006() {
    super(CR.EIGHT.log().divide(CR.valueOf(23).log()));
  }
}
