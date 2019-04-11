package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028028 Expansion of <code>1/((1-3*x)*(1-4*x)*(1-5*x)*(1-9*x))</code>.
 * @author Sean A. Irvine
 */
public class A028028 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028028() {
    super(new long[] {-540, 483, -155, 21}, new long[] {1, 21, 286, 3234});
  }
}
