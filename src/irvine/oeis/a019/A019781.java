package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019781 Decimal expansion of sqrt(e)/8.
 * @author Sean A. Irvine
 */
public class A019781 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019781() {
    super(CR.E.sqrt().divide(CR.EIGHT));
  }
}
