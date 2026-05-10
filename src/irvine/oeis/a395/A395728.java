package irvine.oeis.a395;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A395728 Decimal expansion of the ratio of the maximum area to the mean area of the orthogonal projection of a regular dodecahedron.
 * @author Sean A. Irvine
 */
public class A395728 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A395728() {
    super(1, CR.FIVE.sqrt().add(1).divide(3));
  }
}
