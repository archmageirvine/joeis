package irvine.oeis.a104;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A104457 Decimal expansion of 1 + phi = phi^2 = (3 + sqrt(5))/2.
 * @author Sean A. Irvine
 */
public class A104457 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A104457() {
    super(CR.THREE.add(CR.FIVE.sqrt()).divide(CR.TWO));
  }
}
