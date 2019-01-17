package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016717.
 * @author Sean A. Irvine
 */
public class A016717 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(94).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
