package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016663.
 * @author Sean A. Irvine
 */
public class A016663 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(40).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
