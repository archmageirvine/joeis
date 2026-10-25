
package irvine.oeis.a087;

import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A087013 Decimal expansion of G(1/4) where G is the Barnes G-function.
 * @author Sean A. Irvine
 */
public class A087013 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A087013() {
    super(0, CrFunctions.BARNES_G.cr(Q.ONE_QUARTER));
  }
}
