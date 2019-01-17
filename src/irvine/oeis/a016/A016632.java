package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016632.
 * @author Sean A. Irvine
 */
public class A016632 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(9).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
