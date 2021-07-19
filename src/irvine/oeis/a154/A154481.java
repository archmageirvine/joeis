package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154481 Decimal expansion of log_13 (14).
 * @author Sean A. Irvine
 */
public class A154481 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154481() {
    super(CR.valueOf(14).log().divide(CR.valueOf(13).log()));
  }
}
