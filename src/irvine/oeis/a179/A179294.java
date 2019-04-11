package irvine.oeis.a179;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A179294 Decimal expansion of radius of inscribed sphere about a regular icosahedron with edge <code>= 1</code>.
 * @author Sean A. Irvine
 */
public class A179294 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(42).add(CR.valueOf(1620).sqrt()).sqrt().divide(CR.valueOf(12));

  @Override
  protected CR getCR() {
    return N;
  }
}
