package irvine.oeis.a346;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A346572.
 * @author Sean A. Irvine
 */
public class A346572 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A346572() {
    super(CR.TWO.subtract(CR.PI.pow(3).multiply(7).divide(CR.valueOf(216))));
  }
}

