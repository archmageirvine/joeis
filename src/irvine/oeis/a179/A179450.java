package irvine.oeis.a179;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A179450 Decimal expansion of the volume of an icosidodecahedron with edge length 1.
 * @author Sean A. Irvine
 */
public class A179450 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A179450() {
    super(CR.valueOf(45).add(CR.valueOf(1445).sqrt()).divide(CR.SIX));
  }
}
