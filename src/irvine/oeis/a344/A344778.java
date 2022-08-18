package irvine.oeis.a344;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A344778 Decimal expansion of 4 * Pi^5 / (729 * sqrt(3)).
 * @author Sean A. Irvine
 */
public class A344778 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A344778() {
    super(0, CR.PI.pow(5).multiply(CR.FOUR).divide(CR.valueOf(729).multiply(CR.THREE.sqrt())));
  }
}

