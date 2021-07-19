package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155741 Decimal expansion of log_8 (22).
 * @author Sean A. Irvine
 */
public class A155741 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155741() {
    super(CR.valueOf(22).log().divide(CR.EIGHT.log()));
  }
}
