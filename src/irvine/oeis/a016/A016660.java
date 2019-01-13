package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016660.
 * @author Sean A. Irvine
 */
public class A016660 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(37).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
