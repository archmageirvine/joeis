package irvine.oeis.a052;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A052119 Decimal expansion of number with continued fraction expansion 0, 1, 2, 3, 4, 5, 6, ...
 * @author Sean A. Irvine
 */
public class A052119 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A052119() {
    super(0, CrFunctions.BESSEL_I.cr(1, CR.TWO).divide(CrFunctions.BESSEL_I0.cr(CR.TWO)));
  }
}
