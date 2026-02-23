package irvine.oeis.a392;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A392453 Decimal expansion of Gamma(1/3)^18/(8960*Pi^6).
 * @author Sean A. Irvine
 */
public class A392453 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A392453() {
    super(1, CrFunctions.GAMMA.cr(CR.ONE_THIRD).pow(18).divide(CR.PI.pow(6).multiply(8960)));
  }
}
