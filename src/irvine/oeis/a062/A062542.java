package irvine.oeis.a062;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A062542 Decimal expansion of the continued fraction constant (base 10).
 * @author Sean A. Irvine
 */
public class A062542 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A062542() {
    super(CR.PI.multiply(CR.PI).divide(CR.TWO.log().multiply(CR.TEN.log()).multiply(6)));
  }
}

