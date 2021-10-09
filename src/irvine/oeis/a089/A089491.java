package irvine.oeis.a089;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A089491 Decimal expansion of Buffon's constant 3/Pi.
 * @author Sean A. Irvine
 */
public class A089491 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A089491() {
    super(CR.THREE.divide(CR.PI));
  }
}
