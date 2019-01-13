package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020863.
 * @author Sean A. Irvine
 */
public class A020863 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(11).log().divide(CR.TWO.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
