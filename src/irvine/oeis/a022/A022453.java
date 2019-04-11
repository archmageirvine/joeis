package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022453 Expansion of <code>1/((1-x)*(1-5*x)*(1-7*x)*(1-9*x))</code>.
 * @author Sean A. Irvine
 */
public class A022453 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022453() {
    super(new long[] {-315, 458, -164, 22}, new long[] {1, 22, 320, 3890});
  }
}
