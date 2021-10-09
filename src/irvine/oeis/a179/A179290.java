package irvine.oeis.a179;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A179290 Decimal expansion of length of edge of a regular icosahedron with radius of circumscribed sphere = 1.
 * @author Sean A. Irvine
 */
public class A179290 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A179290() {
    super(CR.valueOf(50).subtract(CR.valueOf(500).sqrt()).sqrt().divide(CR.FIVE));
  }
}
