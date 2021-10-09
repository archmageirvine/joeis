package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019778 Decimal expansion of sqrt(e)/5.
 * @author Sean A. Irvine
 */
public class A019778 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019778() {
    super(CR.E.sqrt().divide(CR.FIVE));
  }
}
