package irvine.oeis.a183;

import irvine.oeis.LinearRecurrence;

/**
 * A183712 <code>1/20</code> of the number of <code>(n+1)</code> X <code>3 0</code>..4 arrays with every 2 X 2 subblock strictly increasing clockwise or counterclockwise with one decrease.
 * @author Sean A. Irvine
 */
public class A183712 extends LinearRecurrence {

  /** Construct the sequence. */
  public A183712() {
    super(new long[] {-1, 1, 3}, new long[] {5, 17, 54});
  }
}
