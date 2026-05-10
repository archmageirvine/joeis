package irvine.oeis.a395;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A395730 Decimal expansion of the maximum area of cross-section of a regular dodecahedron of unit edge length.
 * @author Sean A. Irvine
 */
public class A395730 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A395730() {
    super(1, CR.FIVE.sqrt().multiply(29).add(65).divide(2).sqrt().multiply(5).divide(8));
  }
}
