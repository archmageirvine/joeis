package irvine.oeis.a076;

import irvine.oeis.LinearRecurrence;

/**
 * A076293 Numbers k where the root mean square (RMS) of k and 7 is an integer, i.e., <code>sqrt((k^2 + 7^2)/2)</code> is an integer.
 * @author Sean A. Irvine
 */
public class A076293 extends LinearRecurrence {

  /** Construct the sequence. */
  public A076293() {
    super(new long[] {-1, 0, 0, 6, 0, 0}, new long[] {1, 7, 17, 23, 49, 103});
  }
}
