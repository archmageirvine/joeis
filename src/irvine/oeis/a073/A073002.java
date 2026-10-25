
package irvine.oeis.a073;

import irvine.math.cr.functions.CrFunctions;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A073002 Decimal expansion of -zeta'(2) (the first derivative of the zeta function at 2).
 * @author Sean A. Irvine
 */
public class A073002 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A073002() {
    super(0, CrFunctions.ZETA_PRIME.cr(2).negate());
  }
}
