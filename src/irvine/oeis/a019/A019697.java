package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019697 Decimal expansion of 2*Pi/11.
 * @author Sean A. Irvine
 */
public class A019697 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019697() {
    super(0, CR.TAU.divide(CR.valueOf(11)));
  }
}
