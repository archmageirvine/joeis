
package irvine.oeis.a087;

import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A087014 Decimal expansion of G(1/2) where G is the Barnes G-function.
 * @author Sean A. Irvine
 */
public class A087014 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A087014() {
    super(0, CrFunctions.BARNES_G.cr(Q.HALF));
  }
}
