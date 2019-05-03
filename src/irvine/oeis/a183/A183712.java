package irvine.oeis.a183;

import irvine.oeis.LinearRecurrence;

/**
 * A183712 1/20 of the number of <code>(n+1) X 3 0..4</code> arrays with every <code>2 X 2</code> subblock strictly increasing clockwise or counterclockwise with one decrease.
 * @author Sean A. Irvine
 */
public class A183712 extends LinearRecurrence {

  /** Construct the sequence. */
  public A183712() {
    super(new long[] {-1, 1, 3}, new long[] {5, 17, 54});
  }
}
