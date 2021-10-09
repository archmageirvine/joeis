package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154186 Decimal expansion of log_15 (11).
 * @author Sean A. Irvine
 */
public class A154186 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154186() {
    super(CR.valueOf(11).log().divide(CR.valueOf(15).log()));
  }
}
