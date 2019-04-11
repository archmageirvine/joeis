package irvine.oeis.a099;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A099285 Decimal expansion of -Ei(-1), negated exponential integral at <code>-1</code>.
 * @author Sean A. Irvine
 */
public class A099285 extends DecimalExpansionSequence {

  private static final CR N = CR.ONE.negate().ei().negate();

  @Override
  protected CR getCR() {
    return N;
  }
}
