package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154538 Decimal expansion of log_24(14).
 * @author Sean A. Irvine
 */
public class A154538 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154538() {
    super(CR.valueOf(14).log().divide(CR.valueOf(24).log()));
  }
}
