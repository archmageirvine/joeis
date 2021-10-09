package irvine.oeis.a346;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A346907 Decimal expansion of 2 - 3 * Pi^3 / (2^6 * sqrt(2)).
 * @author Sean A. Irvine
 */
public class A346907 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A346907() {
    super(CR.TWO.subtract(CR.PI.pow(3).multiply(CR.THREE).divide(CR.SQRT2.multiply(64))));
  }
}

