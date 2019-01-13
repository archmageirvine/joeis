package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154213.
 * @author Sean A. Irvine
 */
public class A154213 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(12).log().divide(CR.valueOf(21).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
