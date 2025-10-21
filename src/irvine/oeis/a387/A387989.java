package irvine.oeis.a387;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A387989 Decimal expansion of the perimeter equal to the area of an equable decagon (10-gon).
 * @author Sean A. Irvine
 */
public class A387989 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A387989() {
    super(2, CR.ONE.subtract(CR.TWO.divide(CR.FIVE.sqrt())).sqrt().multiply(40));
  }
}
