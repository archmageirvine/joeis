package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154719 Decimal expansion of log_23 (15).
 * @author Sean A. Irvine
 */
public class A154719 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154719() {
    super(CR.valueOf(15).log().divide(CR.valueOf(23).log()));
  }
}
