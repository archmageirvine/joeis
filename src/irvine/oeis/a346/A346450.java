package irvine.oeis.a346;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A346450 Decimal expansion of 1681 * Pi^6 / (933120 * sqrt(3)).
 * @author Sean A. Irvine
 */
public class A346450 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A346450() {
    super(0, CR.PI.pow(6).multiply(1681).divide(CR.THREE.sqrt().multiply(933120)));
  }
}

