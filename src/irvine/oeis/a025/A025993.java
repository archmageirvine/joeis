package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025993.
 * @author Sean A. Irvine
 */
public class A025993 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025993() {
    super(new long[] {-630, 601, -185, 23}, new long[] {1, 23, 344, 4258});
  }
}
