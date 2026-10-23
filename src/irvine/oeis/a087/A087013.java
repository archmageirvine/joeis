
package irvine.oeis.a087;

import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A086993.
 * @author Sean A. Irvine
 */
public class A087013 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A087013() {
    super(0, CrFunctions.BARNES_G.cr(Q.ONE_QUARTER));
  }
}
