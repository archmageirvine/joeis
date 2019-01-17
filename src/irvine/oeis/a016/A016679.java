package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016679.
 * @author Sean A. Irvine
 */
public class A016679 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(56).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
