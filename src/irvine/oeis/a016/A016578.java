package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016578 Decimal expansion of log(3/2).
 * @author Sean A. Irvine
 */
public class A016578 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016578() {
    super(0, CR.valueOf(new Q(3, 2)).log());
  }
}
