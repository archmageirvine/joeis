package irvine.oeis.a384;

import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A384563 Decimal expansion of Beta(1/4,1/4).
 * @author Sean A. Irvine
 */
public class A384563 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A384563() {
    super(1, CrFunctions.BETA.cr(Q.ONE_QUARTER, Q.ONE_QUARTER));
  }
}
