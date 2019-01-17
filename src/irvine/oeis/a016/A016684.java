package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016684.
 * @author Sean A. Irvine
 */
public class A016684 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(61).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
