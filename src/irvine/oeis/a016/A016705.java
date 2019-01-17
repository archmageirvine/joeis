package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016705.
 * @author Sean A. Irvine
 */
public class A016705 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(82).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
