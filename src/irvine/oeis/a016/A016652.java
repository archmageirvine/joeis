package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016652 Decimal expansion of <code>log(29)</code>.
 * @author Sean A. Irvine
 */
public class A016652 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(29).log();

  @Override
  protected CR getCR() {
    return N;
  }
}

