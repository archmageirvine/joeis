package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154397 Decimal expansion of log_15 (13).
 * @author Sean A. Irvine
 */
public class A154397 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154397() {
    super(CR.valueOf(13).log().divide(CR.valueOf(15).log()));
  }
}
