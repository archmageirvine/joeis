package irvine.oeis.a186;

import irvine.oeis.LinearRecurrence;

/**
 * A186422 First differences of <code>A186421</code>.
 * @author Sean A. Irvine
 */
public class A186422 extends LinearRecurrence {

  /** Construct the sequence. */
  public A186422() {
    super(new long[] {1, 1, 0, 0, -1}, new long[] {1, 1, -1, 3, -1});
  }
}
