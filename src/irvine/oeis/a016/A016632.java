package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016632 Decimal expansion of log(9).
 * @author Sean A. Irvine
 */
public class A016632 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016632() {
    super(CR.NINE.log());
  }
}
