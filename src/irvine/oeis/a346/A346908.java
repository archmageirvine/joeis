package irvine.oeis.a346;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A346908.
 * @author Sean A. Irvine
 */
public class A346908 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A346908() {
    super(CR.TWO.subtract(CR.PI.divide(CR.SQRT2.multiply(CR.TWO))));
  }
}

