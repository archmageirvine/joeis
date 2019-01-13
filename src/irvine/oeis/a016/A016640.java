package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016640.
 * @author Sean A. Irvine
 */
public class A016640 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(17).log();

  @Override
  protected CR getCR() {
    return N;
  }
}

