package irvine.oeis.a072;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.oeis.a086.A086199;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A072558 Decimal expansion of the one-ninth constant.
 * @author Sean A. Irvine
 */
public class A072558 extends DecimalExpansionSequence {

  private static CR oneNinthConstant() {
    final CR c = new A086199().getCR();
    return CrFunctions.ELLIPTIC_K.cr(CR.ONE.subtract(c.square()).sqrt()).divide(CrFunctions.ELLIPTIC_K.cr(c)).multiply(CR.PI).negate().exp();
  }

  /** Construct the sequence */
  public A072558() {
    super(0, oneNinthConstant());
  }
}
