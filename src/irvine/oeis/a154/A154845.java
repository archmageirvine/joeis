package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154845 Decimal expansion of log_23 (16).
 * @author Sean A. Irvine
 */
public class A154845 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154845() {
    super(0, CR.valueOf(16).log().divide(CR.valueOf(23).log()));
  }
}
