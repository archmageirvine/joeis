package irvine.oeis.a346;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A346728 Decimal expansion of 11 * Pi^4 / (768 * sqrt(2)).
 * @author Sean A. Irvine
 */
public class A346728 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A346728() {
    super(CR.PI.pow(4).multiply(11).divide(CR.SQRT2.multiply(768)));
  }
}

