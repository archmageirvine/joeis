package irvine.oeis.a383;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A383674.
 * @author Sean A. Irvine
 */
public class A383674 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A383674() {
    super(1, CR.PI.divide(8).add(CR.SQRT2.divide(4).multiply(CrFunctions.ELLIPTIC_K.cr(CR.SQRT2.divide(2)))));
  }
}

