package irvine.oeis.a086;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A086180 Decimal expansion of 1 + sqrt(6).
 * @author Sean A. Irvine
 */
public class A086180 extends DecimalExpansionSequence {

  private static final CR N = CR.ONE.add(CR.valueOf(6).sqrt());

  @Override
  protected CR getCR() {
    return N;
  }
}
