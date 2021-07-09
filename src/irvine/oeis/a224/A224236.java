package irvine.oeis.a224;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A224235 Decimal expansion of speed of light in feet per second.
 * The exact value (by definition) is 299792458/0.3048.
 * @author Georg Fischer
 */
public class A224236 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(new Q(2997924580000L, 3048L));

  @Override
  protected CR getCR() {
    return N;
  }
}
