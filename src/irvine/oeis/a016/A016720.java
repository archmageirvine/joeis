package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016720.
 * @author Sean A. Irvine
 */
public class A016720 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(97).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
