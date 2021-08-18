package irvine.oeis.a344;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A344727 allocated for Sean A. Irvine.
 * @author Sean A. Irvine
 */
public class A344727 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A344727() {
    super(CR.PI.pow(7).multiply(56).divide(CR.valueOf(98415).multiply(CR.THREE.sqrt())));
  }
}

