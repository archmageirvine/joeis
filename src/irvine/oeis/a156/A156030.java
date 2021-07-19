package irvine.oeis.a156;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A156030 Decimal expansion of log_23 (24).
 * @author Sean A. Irvine
 */
public class A156030 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A156030() {
    super(CR.valueOf(24).log().divide(CR.valueOf(23).log()));
  }
}
