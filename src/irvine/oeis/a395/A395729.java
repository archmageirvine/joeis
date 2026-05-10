package irvine.oeis.a395;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A395729 Decimal expansion of the ratio of the minimum area to the mean area of the orthogonal projection of a regular icosahedron.
 * @author Sean A. Irvine
 */
public class A395729 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A395729() {
    super(0, CR.PHI.square().multiply(CR.TWO.divide(15).sqrt()));
  }
}
