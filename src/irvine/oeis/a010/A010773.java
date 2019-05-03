package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.q.Q;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A010773 Decimal expansion of <code>11th</code> root of 2.
 * @author Sean A. Irvine
 */
public class A010773 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.TWO, CR.valueOf(new Q(1, 11)));

  @Override
  protected CR getCR() {
    return N;
  }
}
