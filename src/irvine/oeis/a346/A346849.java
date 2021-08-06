package irvine.oeis.a346;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A346849.
 * @author Sean A. Irvine
 */
public class A346849 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A346849() {
    super(CR.TWO.subtract(CR.PI.pow(7).multiply(307).divide(CR.SQRT2.multiply(655360))));
  }
}

