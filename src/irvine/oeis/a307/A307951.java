package irvine.oeis.a307;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;
import irvine.oeis.a226.A226775;

/**
 * A307951.
 * @author Sean A. Irvine
 */
public class A307951 extends DecimalExpansionSequence {

  private static final CR N = CR.ONE.subtract(CR.TWO.log().divide(A226775.N.log()));

  @Override
  protected CR getCR() {
    return N;
  }
}

