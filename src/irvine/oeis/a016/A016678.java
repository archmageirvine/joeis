package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016678 Decimal expansion of <code>log(55)</code>.
 * @author Sean A. Irvine
 */
public class A016678 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(55).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
