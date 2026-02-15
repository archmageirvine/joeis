package irvine.oeis.a392;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A392150 Decimal expansion of tan(1/6) + sec(1/6).
 * @author Sean A. Irvine
 */
public class A392150 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR C = CR.SIX.inverse();

  /** Construct the sequence */
  public A392150() {
    super(1, REALS.tan(C).add(REALS.sec(C)));
  }
}
