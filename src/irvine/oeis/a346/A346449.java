package irvine.oeis.a346;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A346449.
 * @author Sean A. Irvine
 */
public class A346449 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A346449() {
    super(CR.PI.pow(8).multiply(257543).divide(CR.THREE.sqrt().multiply(1410877440)));
  }
}

