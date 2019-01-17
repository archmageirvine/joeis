package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016689.
 * @author Sean A. Irvine
 */
public class A016689 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(66).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
