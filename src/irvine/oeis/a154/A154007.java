package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154007 Decimal expansion of log_24(8).
 * @author Sean A. Irvine
 */
public class A154007 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154007() {
    super(CR.EIGHT.log().divide(CR.valueOf(24).log()));
  }
}
