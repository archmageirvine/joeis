package irvine.oeis.a232;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A232734 Decimal expansion of Integral <code>{x=0</code>..infinity} <code>1/2^(2^x)</code> dx.
 * @author Sean A. Irvine
 */
public class A232734 extends DecimalExpansionSequence {

  private static final CR LOG2 = CR.TWO.log();
  private static final CR N = LOG2.negate().ei().negate().divide(LOG2);

  @Override
  protected CR getCR() {
    return N;
  }
}
