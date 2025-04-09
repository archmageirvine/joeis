package irvine.oeis.a382;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A382907 Decimal expansion of 1/2 - Pi*(sqrt(2)+1)/16.
 * @author Sean A. Irvine
 */
public class A382907 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A382907() {
    super(0, CR.HALF.subtract(CR.PI.multiply(CR.SQRT2.add(1)).divide(16)));
  }
}
