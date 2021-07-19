package irvine.oeis.a179;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A179292 Decimal expansion of radius of inscribed sphere of an icosahedron with radius of circumscribed sphere = 1.
 * @author Sean A. Irvine
 */
public class A179292 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A179292() {
    super(CR.valueOf(75).add(CR.valueOf(4500).sqrt()).sqrt().divide(CR.valueOf(15)));
  }
}
