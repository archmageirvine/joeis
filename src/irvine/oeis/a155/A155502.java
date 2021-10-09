package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A155502 Decimal expansion of log_8 (20).
 * @author Sean A. Irvine
 */
public class A155502 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155502() {
    super(CR.valueOf(20).log().divide(CR.EIGHT.log()));
  }
}
