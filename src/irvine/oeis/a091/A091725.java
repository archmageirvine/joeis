package irvine.oeis.a091;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A091725.
 * @author Sean A. Irvine
 */
public class A091725 extends DecimalExpansionSequence {

  private static final CR N = CR.ONE.ei();

  @Override
  protected CR getCR() {
    return N;
  }
}
