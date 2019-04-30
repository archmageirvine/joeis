package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016661 Decimal expansion of <code>log(38)</code>.
 * @author Sean A. Irvine
 */
public class A016661 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(38).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
