package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016673.
 * @author Sean A. Irvine
 */
public class A016673 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(50).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
