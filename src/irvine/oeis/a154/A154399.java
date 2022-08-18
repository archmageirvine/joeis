package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154399 Decimal expansion of log_17 (13).
 * @author Sean A. Irvine
 */
public class A154399 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154399() {
    super(0, CR.valueOf(13).log().divide(CR.valueOf(17).log()));
  }
}
