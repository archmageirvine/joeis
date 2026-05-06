package irvine.oeis.a395;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A084713.
 * @author Sean A. Irvine
 */
public class A395729 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A395729() {
    super(0, CR.PHI.square().multiply(CR.TWO.divide(15).sqrt()));
  }
}
