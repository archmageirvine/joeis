package irvine.oeis.a066;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A066666 Decimal expansion of area cut out by a rotating Reuleaux triangle.
 * @author Sean A. Irvine
 */
public class A066666 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A066666() {
    super(CR.PI.divide(CR.SIX).add(CR.THREE.sqrt().multiply(2)).subtract(CR.THREE));
  }
}
