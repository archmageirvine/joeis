package irvine.oeis.a344;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A344688 Decimal expansion of 3236 * Pi^9 / (55801305 * sqrt(3)).
 * @author Sean A. Irvine
 */
public class A344688 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A344688() {
    super(0, CR.PI.pow(9).multiply(3236).divide(CR.valueOf(55801305).multiply(CR.THREE.sqrt())));
  }
}

