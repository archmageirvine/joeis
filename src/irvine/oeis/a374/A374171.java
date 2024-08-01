package irvine.oeis.a374;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A374171 Decimal expansion of log(9/5).
 * @author Sean A. Irvine
 */
public class A374171 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A374171() {
    super(0, CR.valueOf(new Q(9, 5)).log());
  }
}
