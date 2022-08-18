package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154827 Decimal expansion of log_17 (16).
 * @author Sean A. Irvine
 */
public class A154827 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154827() {
    super(0, CR.valueOf(16).log().divide(CR.valueOf(17).log()));
  }
}
