package irvine.oeis.a346;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A346572 Decimal expansion of 2 - 7 * Pi^3 / 216.
 * @author Sean A. Irvine
 */
public class A346572 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A346572() {
    super(CR.TWO.subtract(CR.PI.pow(3).multiply(7).divide(CR.valueOf(216))));
  }
}

