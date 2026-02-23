package irvine.oeis.a393;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A393355 Decimal expansion of the weight factor for Hermite-Gauss quadrature corresponding to abscissa A393353.
 * @author Sean A. Irvine
 */
public class A393355 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A393355() {
    super(0, CR.SQRT_PI.multiply(CR.SIX.sqrt().add(CR.THREE)).divide(12));
  }
}
