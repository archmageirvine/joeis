package irvine.oeis.a073;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A073449 Decimal expansion of cot 1.
 * @author Sean A. Irvine
 */
public class A073449 extends DecimalExpansionSequence {

  private static final CR N = CR.ONE.cos().divide(CR.ONE.sin());

  @Override
  protected CR getCR() {
    return N;
  }
}
