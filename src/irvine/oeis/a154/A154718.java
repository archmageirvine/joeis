package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A154718 Decimal expansion of log_22 (15).
 * @author Sean A. Irvine
 */
public class A154718 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154718() {
    super(CR.valueOf(15).log().divide(CR.valueOf(22).log()));
  }
}
