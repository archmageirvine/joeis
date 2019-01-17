package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016696.
 * @author Sean A. Irvine
 */
public class A016696 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(73).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
