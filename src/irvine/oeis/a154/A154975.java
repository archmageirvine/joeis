package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154975 Decimal expansion of log_19 (18).
 * @author Sean A. Irvine
 */
public class A154975 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154975() {
    super(0, CR.valueOf(18).log().divide(CR.valueOf(19).log()));
  }
}
