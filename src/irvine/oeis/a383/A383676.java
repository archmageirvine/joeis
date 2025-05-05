package irvine.oeis.a383;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A383674.
 * @author Sean A. Irvine
 */
public class A383676 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A383676() {
    super(0, CR.SQRT2.divide(4).multiply(CrFunctions.ELLIPTIC_K.cr(CR.SQRT2.divide(2))).subtract(CR.PI.divide(8)));
  }
}

