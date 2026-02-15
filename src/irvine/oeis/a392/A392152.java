package irvine.oeis.a392;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A392152 Decimal expansion of tan(2/3) + sec(2/3).
 * @author Sean A. Irvine
 */
public class A392152 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR C = CR.valueOf(new Q(2, 3));

  /** Construct the sequence */
  public A392152() {
    super(1, REALS.tan(C).add(REALS.sec(C)));
  }
}
