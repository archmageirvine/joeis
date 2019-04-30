package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016646 Decimal expansion of <code>log(23)</code>.
 * @author Sean A. Irvine
 */
public class A016646 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(23).log();

  @Override
  protected CR getCR() {
    return N;
  }
}

