package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154190 Decimal expansion of log_19 (11).
 * @author Sean A. Irvine
 */
public class A154190 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154190() {
    super(CR.valueOf(11).log().divide(CR.valueOf(19).log()));
  }
}
