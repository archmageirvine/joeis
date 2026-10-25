
package irvine.oeis.a087;

import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A087015 Decimal expansion of G(3/4) where G is the Barnes G-function.
 * @author Sean A. Irvine
 */
public class A087015 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A087015() {
    super(0, CrFunctions.BARNES_G.cr(new Q(3, 4)));
  }
}
