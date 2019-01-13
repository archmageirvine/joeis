package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155526.
 * @author Sean A. Irvine
 */
public class A155526 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(20).log().divide(CR.valueOf(14).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
