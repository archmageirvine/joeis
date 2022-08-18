package irvine.oeis.a179;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A179451 Decimal expansion of the surface area of an icosidodecahedron with side length 1.
 * @author Sean A. Irvine
 */
public class A179451 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A179451() {
    super(2, CR.valueOf(30).multiply(CR.TEN.add(CR.valueOf(45).sqrt()).add(CR.valueOf(75).add(CR.valueOf(4500).sqrt()).sqrt())).sqrt());
  }
}
