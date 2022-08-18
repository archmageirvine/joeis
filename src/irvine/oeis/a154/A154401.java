package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154401 Decimal expansion of log_19 (13).
 * @author Sean A. Irvine
 */
public class A154401 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154401() {
    super(0, CR.valueOf(13).log().divide(CR.valueOf(19).log()));
  }
}
