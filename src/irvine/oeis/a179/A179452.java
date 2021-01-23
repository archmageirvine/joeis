package irvine.oeis.a179;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A179452 Decimal expansion of sqrt(5 + 2*sqrt(5))/2, the height of a regular pentagon and midradius of an icosidodecahedron with side length 1.
 * @author Sean A. Irvine
 */
public class A179452 extends DecimalExpansionSequence {

  private static final CR N = CR.FIVE.add(CR.valueOf(20).sqrt()).sqrt().divide(CR.TWO);

  @Override
  protected CR getCR() {
    return N;
  }
}
