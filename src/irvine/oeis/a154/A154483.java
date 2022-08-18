package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154483 Decimal expansion of log_16 (14).
 * @author Sean A. Irvine
 */
public class A154483 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154483() {
    super(0, CR.valueOf(14).log().divide(CR.valueOf(16).log()));
  }
}
