package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154434 Decimal expansion of log_21 (13).
 * @author Sean A. Irvine
 */
public class A154434 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154434() {
    super(CR.valueOf(13).log().divide(CR.valueOf(21).log()));
  }
}
