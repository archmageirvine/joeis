package irvine.oeis.a347;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A347055 Decimal expansion of Pi * (sqrt(3) - sqrt(2)).
 * @author Sean A. Irvine
 */
public class A347055 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A347055() {
    super(CR.PI.multiply(CR.THREE.sqrt().subtract(CR.SQRT2)));
  }
}
