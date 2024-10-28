package irvine.oeis.a060;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A060997 Decimal representation of continued fraction 1, 2, 3, 4, 5, 6, 7, ...
 * @author Sean A. Irvine
 */
public class A060997 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A060997() {
    super(CrFunctions.BESSEL_I0.cr(CR.TWO).divide(CrFunctions.BESSEL_I.cr(1, CR.TWO)));
  }
}
