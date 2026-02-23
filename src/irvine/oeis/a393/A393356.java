package irvine.oeis.a393;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A393356 Decimal expansion of the weight factor for Hermite-Gauss quadrature corresponding to abscissa A393354.
 * @author Sean A. Irvine
 */
public class A393356 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A393356() {
    super(0, CR.SQRT_PI.multiply(CR.THREE.subtract(CR.SIX.sqrt()).divide(12)));
  }
}

