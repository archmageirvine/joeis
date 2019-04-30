package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016657 Decimal expansion of <code>log(34)</code>.
 * @author Sean A. Irvine
 */
public class A016657 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(34).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
