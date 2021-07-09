package irvine.oeis.a224;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A224235 Decimal expansion of number of yards in a meter.
 * The exact value (this is the definition of a yard) is 1/0.9144.
 * @author Georg Fischer
 */
public class A224235 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(new Q(10000, 9144));

  @Override
  protected CR getCR() {
    return N;
  }
}
