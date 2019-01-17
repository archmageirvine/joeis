package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016688.
 * @author Sean A. Irvine
 */
public class A016688 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(65).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
