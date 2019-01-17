package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016723.
 * @author Sean A. Irvine
 */
public class A016723 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(100).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
