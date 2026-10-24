
package irvine.oeis.a087;

import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A086993.
 * @author Sean A. Irvine
 */
public class A087015 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A087015() {
    super(0, CrFunctions.BARNES_G.cr(new Q(3, 4)));
  }
}
