package irvine.oeis.a073;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A073448 Decimal expansion of sec 1.
 * @author Sean A. Irvine
 */
public class A073448 extends DecimalExpansionSequence {

  private static final CR N = CR.ONE.cos().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
