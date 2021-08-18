package irvine.oeis.a344;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A344688 allocated for Sean A. Irvine.
 * @author Sean A. Irvine
 */
public class A344688 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A344688() {
    super(CR.PI.pow(9).multiply(3236).divide(CR.valueOf(55801305).multiply(CR.THREE.sqrt())));
  }
}

