package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154180 Decimal expansion of log_8 (11).
 * @author Sean A. Irvine
 */
public class A154180 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154180() {
    super(CR.valueOf(11).log().divide(CR.EIGHT.log()));
  }
}
