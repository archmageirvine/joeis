package irvine.oeis.a393;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A393371 Decimal expansion of the weight factor for Hermite-Gauss quadrature of degree 7 corresponding to abscissa 0.
 * @author Sean A. Irvine
 */
public class A393371 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A393371() {
    super(0, CR.SQRT_PI.multiply(16).divide(35));
  }
}
