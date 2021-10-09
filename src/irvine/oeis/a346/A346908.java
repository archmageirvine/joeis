package irvine.oeis.a346;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A346908 Decimal expansion of 2 - Pi / (2*sqrt(2)).
 * @author Sean A. Irvine
 */
public class A346908 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A346908() {
    super(CR.TWO.subtract(CR.PI.divide(CR.SQRT2.multiply(CR.TWO))));
  }
}

