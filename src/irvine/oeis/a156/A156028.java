package irvine.oeis.a156;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A156028 Decimal expansion of log_21 (24).
 * @author Sean A. Irvine
 */
public class A156028 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A156028() {
    super(CR.valueOf(24).log().divide(CR.valueOf(21).log()));
  }
}
