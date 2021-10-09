package irvine.oeis.a346;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A346584 Decimal expansion of 11 * Pi^5 / (1944 * sqrt(3)).
 * @author Sean A. Irvine
 */
public class A346584 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A346584() {
    super(CR.PI.pow(5).multiply(11).divide(CR.THREE.sqrt().multiply(1944)));
  }
}

