package irvine.oeis.a346;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A346449 Decimal expansion of 257543 * Pi^8 / (1410877440 * sqrt(3)).
 * @author Sean A. Irvine
 */
public class A346449 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A346449() {
    super(CR.PI.pow(8).multiply(257543).divide(CR.THREE.sqrt().multiply(1410877440)));
  }
}

