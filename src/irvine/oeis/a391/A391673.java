package irvine.oeis.a391;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A391673 allocated for A.H.M. Smeets.
 * @author Sean A. Irvine
 */
public class A391673 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A391673() {
    super(1, CR.SQRT2.negate().add(2).sqrt().add(2).sqrt());
  }
}
