package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154193 Decimal expansion of log_22 (11).
 * @author Sean A. Irvine
 */
public class A154193 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154193() {
    super(0, CR.valueOf(11).log().divide(CR.valueOf(22).log()));
  }
}
