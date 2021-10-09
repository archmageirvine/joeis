package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154540 Decimal expansion of log_2 (15).
 * @author Sean A. Irvine
 */
public class A154540 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154540() {
    super(CR.valueOf(15).log().divide(CR.TWO.log()));
  }
}
