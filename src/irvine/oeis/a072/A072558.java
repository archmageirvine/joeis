package irvine.oeis.a072;

import irvine.math.cr.CR;
import irvine.oeis.a086.A086199;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A093341.
 * @author Sean A. Irvine
 */
public class A072558 extends DecimalExpansionSequence {

  private static CR oneNinthConstant() {
    final CR c = new A086199().getCR();
    return CR.ONE.subtract(c.square()).sqrt().ellipticK().divide(c.ellipticK()).multiply(CR.PI).negate().exp();
  }

  /** Construct the sequence */
  public A072558() {
    super(0, oneNinthConstant());
  }
}
