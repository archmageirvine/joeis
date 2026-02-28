package irvine.oeis.a393;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A393361 Decimal expansion of the weight factor for Hermite-Gauss quadrature of degree 5 corresponding to abscissa A393358.
 * @author Sean A. Irvine
 */
public class A393361 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A393361() {
    super(0, CR.SQRT_PI.multiply(CR.SEVEN.subtract(CR.valueOf(40).sqrt())).divide(60));
  }
}
