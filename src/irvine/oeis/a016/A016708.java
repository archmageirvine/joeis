package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016708.
 * @author Sean A. Irvine
 */
public class A016708 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(85).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
