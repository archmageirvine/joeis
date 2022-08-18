package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154705 Decimal expansion of log_20 (15).
 * @author Sean A. Irvine
 */
public class A154705 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154705() {
    super(0, CR.valueOf(15).log().divide(CR.valueOf(20).log()));
  }
}
