package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A389779 Decimal expansion of the perimeter equal to the area of an equable Reuleaux triangle.
 * @author Sean A. Irvine
 */
public class A389779 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A389779() {
    super(2, CR.PI.square().multiply(2).divide(CR.PI.subtract(CR.THREE.sqrt())));
  }
}

