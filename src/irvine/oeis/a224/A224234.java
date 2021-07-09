package irvine.oeis.a224;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A224234 Decimal expansion of number of feet in a meter.
 * The exact value (this is the definition of a foot) is 1/0.3048.
 * @author Georg Fischer
 */
public class A224234 extends DecimalExpansionSequence {
  private static final CR N = CR.valueOf(new Q(10000, 3048));

  @Override
  protected CR getCR() {
    return N;
  }
}
