package irvine.oeis.a346;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A346451 Decimal expansion of 23 * Pi^4 / (1296 * sqrt(3)).
 * @author Sean A. Irvine
 */
public class A346451 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A346451() {
    super(CR.PI.pow(4).multiply(23).divide(CR.THREE.sqrt().multiply(1296)));
  }
}

