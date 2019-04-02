package irvine.oeis.a179;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A179587 Decimal expansion of the volume of square cupola with edge length 1.
 * @author Sean A. Irvine
 */
public class A179587 extends DecimalExpansionSequence {

  private static final CR N = CR.ONE.add(CR.valueOf(8).sqrt().divide(CR.THREE));

  @Override
  protected CR getCR() {
    return N;
  }
}
