package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016685.
 * @author Sean A. Irvine
 */
public class A016685 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(62).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
