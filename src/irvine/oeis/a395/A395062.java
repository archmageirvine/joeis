package irvine.oeis.a395;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A395062 Decimal expansion of 1 - 1/(1*3)^2 + 1/(1*3*5)^2 - 1/(1*3*5*7)^2 + ...
 * @author Sean A. Irvine
 */
public class A395062 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A395062() {
    super(0, CrFunctions.STRUVE_H.cr(0, CR.ONE).multiply(CR.HALF_PI));
  }
}
