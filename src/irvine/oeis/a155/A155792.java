package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A155792 Decimal expansion of log_24(22).
 * @author Sean A. Irvine
 */
public class A155792 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155792() {
    super(0, CR.valueOf(22).log().divide(CR.valueOf(24).log()));
  }
}
