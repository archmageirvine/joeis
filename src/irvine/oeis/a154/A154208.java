package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154208 Decimal expansion of log_16 (12).
 * @author Sean A. Irvine
 */
public class A154208 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154208() {
    super(CR.valueOf(12).log().divide(CR.valueOf(16).log()));
  }
}
