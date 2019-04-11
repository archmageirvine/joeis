package irvine.oeis.a179;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A179292 Decimal expansion of radius of inscribed sphere of an icosahedron with radius of circumscribed sphere <code>= 1</code>.
 * @author Sean A. Irvine
 */
public class A179292 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(75).add(CR.valueOf(4500).sqrt()).sqrt().divide(CR.valueOf(15));

  @Override
  protected CR getCR() {
    return N;
  }
}
