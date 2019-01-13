package irvine.oeis.a002;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A002285.
 * @author Sean A. Irvine
 */
public class A002285 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(10).log().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
