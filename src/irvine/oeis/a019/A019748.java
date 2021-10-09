package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019748 Decimal expansion of e/11.
 * @author Sean A. Irvine
 */
public class A019748 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019748() {
    super(CR.E.divide(CR.valueOf(11)));
  }
}
