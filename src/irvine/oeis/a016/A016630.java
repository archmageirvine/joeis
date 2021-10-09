package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016630 Decimal expansion of log(7).
 * @author Sean A. Irvine
 */
public class A016630 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016630() {
    super(CR.SEVEN.log());
  }
}
