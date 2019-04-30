package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016662 Decimal expansion of <code>log(39)</code>.
 * @author Sean A. Irvine
 */
public class A016662 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(39).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
