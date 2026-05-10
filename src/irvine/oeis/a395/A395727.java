package irvine.oeis.a395;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A395727 Decimal expansion of the ratio of the minimum area to the mean area of the orthogonal projection of a regular dodecahedron.
 * @author Sean A. Irvine
 */
public class A395727 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A395727() {
    super(0, CR.PI.multiply(3).divide(10).tan().multiply(2).divide(3));
  }
}
