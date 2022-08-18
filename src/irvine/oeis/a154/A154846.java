package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154846 Decimal expansion of log_24(16).
 * @author Sean A. Irvine
 */
public class A154846 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154846() {
    super(0, CR.valueOf(16).log().divide(CR.valueOf(24).log()));
  }
}
