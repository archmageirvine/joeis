package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154837 Decimal expansion of log_19 (16).
 * @author Sean A. Irvine
 */
public class A154837 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154837() {
    super(0, CR.valueOf(16).log().divide(CR.valueOf(19).log()));
  }
}
