package irvine.oeis.a392;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A392148 Decimal expansion of tan(1/4) + sec(1/4).
 * @author Sean A. Irvine
 */
public class A392148 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR C = CR.valueOf(Q.ONE_QUARTER);

  /** Construct the sequence */
  public A392148() {
    super(1, REALS.tan(C).add(REALS.sec(C)));
  }
}
