package irvine.oeis.a131;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A131594 Decimal expansion of sqrt(2)/3, the volume of a regular octahedron with edge length 1.
 * @author Sean A. Irvine
 */
public class A131594 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A131594() {
    super(0, CR.SQRT2.divide(CR.THREE));
  }
}
