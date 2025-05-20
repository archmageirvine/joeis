package irvine.oeis.a383;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A383759 Decimal expansion of infinite nested radical sqrt(8-sqrt(8-sqrt(8+sqrt(8-...)))).
 * @author Sean A. Irvine
 */
public class A383759 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A383759() {
    super(1, CR.PI.divide(18).cos().multiply(2).multiply(CR.THREE.sqrt()).subtract(1));
  }
}
