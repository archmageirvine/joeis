package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154433 Decimal expansion of log_20 (13).
 * @author Sean A. Irvine
 */
public class A154433 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154433() {
    super(0, CR.valueOf(13).log().divide(CR.valueOf(20).log()));
  }
}
