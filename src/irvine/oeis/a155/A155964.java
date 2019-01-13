package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155964.
 * @author Sean A. Irvine
 */
public class A155964 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(24).log().divide(CR.valueOf(7).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
