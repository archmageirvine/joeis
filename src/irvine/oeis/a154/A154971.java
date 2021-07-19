package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154971 Decimal expansion of log_14 (18).
 * @author Sean A. Irvine
 */
public class A154971 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154971() {
    super(CR.valueOf(18).log().divide(CR.valueOf(14).log()));
  }
}
