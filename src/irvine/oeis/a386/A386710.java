package irvine.oeis.a386;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A386710 Decimal expansion of BesselI(2, 2 * sqrt(2)).
 * @author Sean A. Irvine
 */
public class A386710 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A386710() {
    super(1, CrFunctions.BESSEL_I.cr(2, CR.SQRT2.multiply(2)));
  }
}
