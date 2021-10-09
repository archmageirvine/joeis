package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154184 Decimal expansion of log_13 (11).
 * @author Sean A. Irvine
 */
public class A154184 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154184() {
    super(CR.valueOf(11).log().divide(CR.valueOf(13).log()));
  }
}
