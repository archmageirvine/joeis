package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155964 Decimal expansion of log_7(24).
 * @author Sean A. Irvine
 */
public class A155964 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A155964() {
    super(CR.valueOf(24).log().divide(CR.SEVEN.log()));
  }
}
