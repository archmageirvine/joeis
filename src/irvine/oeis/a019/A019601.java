package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019601 Decimal expansion of 2*Pi*e/9.
 * @author Sean A. Irvine
 */
public class A019601 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019601() {
    super(CR.TAU.multiply(CR.E).divide(CR.NINE));
  }
}
