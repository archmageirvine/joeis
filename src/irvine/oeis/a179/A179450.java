package irvine.oeis.a179;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A179450 Decimal expansion of the volume of an icosidodecahedron with edge length 1.
 * @author Sean A. Irvine
 */
public class A179450 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(45).add(CR.valueOf(1445).sqrt()).divide(CR.SIX);

  @Override
  protected CR getCR() {
    return N;
  }
}
