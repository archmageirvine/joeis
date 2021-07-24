package irvine.oeis.a068;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A068467 Decimal expansion of (1/4)! = Gamma(5/4).
 * @author Sean A. Irvine
 */
public class A068467 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A068467() {
    super(A068466.GAMMA_QUARTER.divide(CR.FOUR));
  }
}
