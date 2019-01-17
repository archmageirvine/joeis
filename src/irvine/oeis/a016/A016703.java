package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016703.
 * @author Sean A. Irvine
 */
public class A016703 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(80).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
