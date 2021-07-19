package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154697 Decimal expansion of log_19 (15).
 * @author Sean A. Irvine
 */
public class A154697 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A154697() {
    super(CR.valueOf(15).log().divide(CR.valueOf(19).log()));
  }
}
