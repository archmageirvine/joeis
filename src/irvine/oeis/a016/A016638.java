package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016638 Decimal expansion of <code>log(15)</code>.
 * @author Sean A. Irvine
 */
public class A016638 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(15).log();

  @Override
  protected CR getCR() {
    return N;
  }
}

