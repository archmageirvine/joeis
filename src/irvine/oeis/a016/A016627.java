package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016627 Decimal expansion of log(4).
 * @author Sean A. Irvine
 */
public class A016627 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016627() {
    super(CR.FOUR.log());
  }
}
