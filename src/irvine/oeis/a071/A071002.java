package irvine.oeis.a071;

import irvine.oeis.cons.DecimalExpansionSequence;
import irvine.oeis.a068.A068466;

/**
 * A071002 Binary expansion of gamma(1/4).
 * @author Sean A. Irvine
 */
public class A071002 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A071002() {
    super(1, A068466.GAMMA_QUARTER, 2);
  }
}

