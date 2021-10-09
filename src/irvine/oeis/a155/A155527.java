package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A155527 Decimal expansion of log_15 (20).
 * @author Sean A. Irvine
 */
public class A155527 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155527() {
    super(CR.valueOf(20).log().divide(CR.valueOf(15).log()));
  }
}
