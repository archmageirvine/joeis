package irvine.oeis.a066;

import irvine.oeis.LinearRecurrence;

/**
 * A066810 Expansion of <code>x^2/((1-3*x)*(1-2*x)^2)</code>.
 * @author Sean A. Irvine
 */
public class A066810 extends LinearRecurrence {

  /** Construct the sequence. */
  public A066810() {
    super(new long[] {12, -16, 7}, new long[] {0, 0, 1});
  }
}
