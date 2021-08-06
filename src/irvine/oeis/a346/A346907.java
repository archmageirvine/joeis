package irvine.oeis.a346;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A346907.
 * @author Sean A. Irvine
 */
public class A346907 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A346907() {
    super(CR.TWO.subtract(CR.PI.pow(3).multiply(CR.THREE).divide(CR.SQRT2.multiply(64))));
  }
}

