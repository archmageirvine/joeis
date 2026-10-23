
package irvine.oeis.a073;

import irvine.math.cr.functions.CrFunctions;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A086993.
 * @author Sean A. Irvine
 */
public class A073002 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A073002() {
    super(0, CrFunctions.ZETA_PRIME.cr(2).negate());
  }
}
