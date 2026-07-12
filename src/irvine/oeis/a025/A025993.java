package irvine.oeis.a025;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A025993 Expansion of 1/((1-2*x)*(1-5*x)*(1-7*x)*(1-9*x)).
 * @author Sean A. Irvine
 */
public class A025993 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025993() {
    super(new long[] {-630, 601, -185, 23}, new long[] {1, 23, 344, 4258});
  }
}
