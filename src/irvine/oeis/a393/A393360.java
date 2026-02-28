package irvine.oeis.a393;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A393360 Decimal expansion of the weight factor for Hermite-Gauss quadrature of degree 5 corresponding to abscissa A393357.
 * @author Sean A. Irvine
 */
public class A393360 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A393360() {
    super(0, CR.SQRT_PI.multiply(CR.valueOf(40).sqrt().add(7)).divide(60));
  }
}
