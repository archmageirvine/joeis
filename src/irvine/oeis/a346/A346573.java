package irvine.oeis.a346;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A346573.
 * @author Sean A. Irvine
 */
public class A346573 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A346573() {
    super(CR.TWO.subtract(CR.PI.divide(CR.THREE)));
  }
}

