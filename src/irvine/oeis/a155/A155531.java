package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155531 Decimal expansion of log_19 (20).
 * @author Sean A. Irvine
 */
public class A155531 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155531() {
    super(CR.valueOf(20).log().divide(CR.valueOf(19).log()));
  }
}
