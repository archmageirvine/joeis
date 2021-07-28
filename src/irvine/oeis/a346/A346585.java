package irvine.oeis.a346;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A346585 Decimal expansion of Pi^3 / (18 * sqrt(3)).
 * @author Sean A. Irvine
 */
public class A346585 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A346585() {
    super(CR.PI.pow(3).divide(CR.THREE.sqrt().multiply(18)));
  }
}

