package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A155129 Decimal expansion of log_21 (19).
 * @author Sean A. Irvine
 */
public class A155129 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155129() {
    super(CR.valueOf(19).log().divide(CR.valueOf(21).log()));
  }
}
