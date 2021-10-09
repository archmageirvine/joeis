package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154191 Decimal expansion of log_20 (11).
 * @author Sean A. Irvine
 */
public class A154191 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154191() {
    super(CR.valueOf(11).log().divide(CR.valueOf(20).log()));
  }
}
