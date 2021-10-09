package irvine.oeis.a346;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A346583 Decimal expansion of 301 * Pi^7 / (524880 * sqrt(3)).
 * @author Sean A. Irvine
 */
public class A346583 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A346583() {
    super(CR.PI.pow(7).multiply(301).divide(CR.THREE.sqrt().multiply(524880)));
  }
}

