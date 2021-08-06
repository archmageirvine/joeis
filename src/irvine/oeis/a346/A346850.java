package irvine.oeis.a346;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A346850.
 * @author Sean A. Irvine
 */
public class A346850 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A346850() {
    super(CR.TWO.subtract(CR.PI.pow(5).multiply(19).divide(CR.SQRT2.multiply(4096))));
  }
}

