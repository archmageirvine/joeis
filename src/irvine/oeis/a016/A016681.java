package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016681.
 * @author Sean A. Irvine
 */
public class A016681 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(58).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
