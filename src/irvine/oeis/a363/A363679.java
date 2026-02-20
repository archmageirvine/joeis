package irvine.oeis.a363;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A363679 Decimal expansion of the sum of the reciprocals of triangular polygorials A006472.
 * @author Sean A. Irvine
 */
public class A363679 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A363679() {
    super(1, CrFunctions.BESSEL_I.cr(1, CR.SQRT2.multiply(2)).divide(CR.SQRT2));
  }
}
