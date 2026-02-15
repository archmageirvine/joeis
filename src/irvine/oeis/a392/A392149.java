package irvine.oeis.a392;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A392149 Decimal expansion of tan(1/5) + sec(1/5).
 * @author Sean A. Irvine
 */
public class A392149 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private static final CR C = CR.FIVE.inverse();

  /** Construct the sequence */
  public A392149() {
    super(1, REALS.tan(C).add(REALS.sec(C)));
  }
}
