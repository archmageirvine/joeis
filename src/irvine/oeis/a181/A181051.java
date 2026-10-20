package irvine.oeis.a181;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A181051 Incorrect duplicate of A073821.
 * @author Sean A. Irvine
 */
public class A181051 extends DecimalExpansionSequence {

  private static final CR ONE_QUARTER = CR.valueOf(Q.ONE_QUARTER);

  /** Construct the sequence. */
  public A181051() {
    super(1, ComputableReals.SINGLETON.hypergeometric(CR.HALF.negate(), ONE_QUARTER, ONE_QUARTER)
      .divide(ComputableReals.SINGLETON.hypergeometric(CR.HALF, CR.valueOf(new Q(5, 4)), ONE_QUARTER)));
  }
}

