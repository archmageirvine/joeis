package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019754 Decimal expansion of e/17.
 * @author Sean A. Irvine
 */
public class A019754 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019754() {
    super(0, CR.E.divide(CR.valueOf(17)));
  }
}
