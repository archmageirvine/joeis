package irvine.oeis.a344;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A344727 Decimal expansion of 56 * Pi^7 / (98415 * sqrt(3)).
 * @author Sean A. Irvine
 */
public class A344727 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A344727() {
    super(CR.PI.pow(7).multiply(56).divide(CR.valueOf(98415).multiply(CR.THREE.sqrt())));
  }
}

