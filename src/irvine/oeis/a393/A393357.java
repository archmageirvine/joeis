package irvine.oeis.a393;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A393357 Decimal expansion of the smallest positive zero of the Hermite polynomial of degree 5.
 * @author Sean A. Irvine
 */
public class A393357 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A393357() {
    super(0, CR.FIVE.subtract(CR.TEN.sqrt()).divide(2).sqrt());
  }
}
