package irvine.oeis.a346;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A346849 Decimal expansion of 2 - 307 * Pi^7 / (655360 * sqrt(2)).
 * @author Sean A. Irvine
 */
public class A346849 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A346849() {
    super(0, CR.TWO.subtract(CR.PI.pow(7).multiply(307).divide(CR.SQRT2.multiply(655360))));
  }
}

