package irvine.oeis.a347;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A347055 allocated for Sean A. Irvine.
 * @author Sean A. Irvine
 */
public class A347055 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A347055() {
    super(CR.PI.multiply(CR.THREE.sqrt().subtract(CR.SQRT2)));
  }
}
