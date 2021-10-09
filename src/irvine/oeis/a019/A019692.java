package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A019692 Decimal expansion of 2*Pi.
 * @author Sean A. Irvine
 */
public class A019692 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019692() {
    super(CR.TWO.multiply(CR.PI));
  }
}
