package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016668.
 * @author Sean A. Irvine
 */
public class A016668 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(45).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
