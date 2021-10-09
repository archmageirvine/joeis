package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154294 Decimal expansion of log_7(13).
 * @author Sean A. Irvine
 */
public class A154294 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154294() {
    super(CR.valueOf(13).log().divide(CR.SEVEN.log()));
  }
}
