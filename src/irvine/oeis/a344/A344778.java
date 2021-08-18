package irvine.oeis.a344;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A344778 allocated for Sean A. Irvine.
 * @author Sean A. Irvine
 */
public class A344778 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A344778() {
    super(CR.PI.pow(5).multiply(CR.FOUR).divide(CR.valueOf(729).multiply(CR.THREE.sqrt())));
  }
}

