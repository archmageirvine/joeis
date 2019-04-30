package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016718 Decimal expansion of <code>log(95)</code>.
 * @author Sean A. Irvine
 */
public class A016718 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(95).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
