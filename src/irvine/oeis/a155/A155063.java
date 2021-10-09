package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A155063 Decimal expansion of log_11 (19).
 * @author Sean A. Irvine
 */
public class A155063 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155063() {
    super(CR.valueOf(19).log().divide(CR.valueOf(11).log()));
  }
}
