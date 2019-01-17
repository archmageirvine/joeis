package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016706.
 * @author Sean A. Irvine
 */
public class A016706 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(83).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
