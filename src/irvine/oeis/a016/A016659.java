package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016659.
 * @author Sean A. Irvine
 */
public class A016659 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(36).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
