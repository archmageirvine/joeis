package irvine.oeis.a181;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A181051 Decimal expansion of the generalized continued fraction 2/(4+6/(8+10/(12+14/(16+...)))), using every even integer.
 * @author Sean A. Irvine
 */
public class A181051 extends DecimalExpansionSequence {

  private static final CR ONE_QUARTER = CR.valueOf(Q.ONE_QUARTER);

  /** Construct the sequence. */
  public A181051() {
    super(0, ComputableReals.SINGLETON.hypergeometric(CR.HALF.negate(), ONE_QUARTER, ONE_QUARTER)
      .divide(ComputableReals.SINGLETON.hypergeometric(CR.HALF, CR.valueOf(new Q(5, 4)), ONE_QUARTER)));
  }
}

