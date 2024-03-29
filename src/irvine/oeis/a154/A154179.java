package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154179 Decimal expansion of log_7(11).
 * @author Sean A. Irvine
 */
public class A154179 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154179() {
    super(CR.valueOf(11).log().divide(CR.SEVEN.log()));
  }
}
