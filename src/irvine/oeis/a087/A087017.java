
package irvine.oeis.a087;

import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A087017 Decimal expansion of G(5/2) where G is the Barnes G-function.
 * @author Sean A. Irvine
 */
public class A087017 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A087017() {
    super(0, CrFunctions.BARNES_G.cr(new Q(5, 2)));
  }
}
