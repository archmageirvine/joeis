package irvine.oeis.a071;

import irvine.oeis.a068.A068466;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A071002 Binary expansion of Gamma(1/4).
 * @author Sean A. Irvine
 */
public class A071002 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A071002() {
    super(2, A068466.GAMMA_QUARTER, 2);
  }
}

