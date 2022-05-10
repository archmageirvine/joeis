package irvine.oeis.a071;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;
import irvine.oeis.a068.A068466;

/**
 * A071003 Binary expansion of Gamma(5/4).
 * @author Sean A. Irvine
 */
public class A071003 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A071003() {
    super(1, A068466.GAMMA_QUARTER.divide(CR.FOUR), 2);
  }
}

