package irvine.oeis.a395;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A395732 Decimal expansion of the mean width of a regular dodecahedron of unit edge length.
 * @author Sean A. Irvine
 */
public class A395732 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A395732() {
    super(1, ComputableReals.SINGLETON.atan(CR.TWO).multiply(15).divide(CR.TAU));
  }
}
