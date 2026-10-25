
package irvine.oeis.a084;

import irvine.math.cr.functions.CrFunctions;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A084448 Decimal expansion of (negative of) Kinkelin constant.
 * @author Sean A. Irvine
 */
public class A084448 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A084448() {
    super(0, CrFunctions.ZETA_PRIME.cr(-1).negate());
  }
}
