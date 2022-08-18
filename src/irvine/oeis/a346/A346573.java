package irvine.oeis.a346;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A346573 Decimal expansion of 2 - Pi/3.
 * @author Sean A. Irvine
 */
public class A346573 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A346573() {
    super(0, CR.TWO.subtract(CR.PI.divide(CR.THREE)));
  }
}

