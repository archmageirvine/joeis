package irvine.oeis.a394;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A394765 allocated for A.H.M. Smeets.
 * @author Sean A. Irvine
 */
public class A394765 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A394765() {
    super(0, CR.SQRT2.multiply(2).add(7).sqrt().subtract(CR.SQRT2).subtract(1).divide(2));
  }
}
