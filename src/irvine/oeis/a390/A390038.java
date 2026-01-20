package irvine.oeis.a390;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A390038 allocated for Charles L. Hohn.
 * @author Sean A. Irvine
 */
public class A390038 extends DecimalExpansionSequence {

  private static final CR B = CR.PHI.log().multiply(2).divide(CR.PI);

  /** Construct the sequence. */
  public A390038() {
    super(1, B.square().add(1).sqrt().divide(B));
  }
}
