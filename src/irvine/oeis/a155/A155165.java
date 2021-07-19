package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155165 Decimal expansion of log_22 (19).
 * @author Sean A. Irvine
 */
public class A155165 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155165() {
    super(CR.valueOf(19).log().divide(CR.valueOf(22).log()));
  }
}
