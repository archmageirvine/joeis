package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154398 Decimal expansion of log_16 (13).
 * @author Sean A. Irvine
 */
public class A154398 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154398() {
    super(0, CR.valueOf(13).log().divide(CR.valueOf(16).log()));
  }
}
