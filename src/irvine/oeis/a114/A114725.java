package irvine.oeis.a114;

import irvine.oeis.LinearRecurrence;

/**
 * A114725.
 * @author Sean A. Irvine
 */
public class A114725 extends LinearRecurrence {

  /** Construct the sequence. */
  public A114725() {
    super(new long[] {1, 5, 10, 10, 5, 1}, new long[] {0, 1, 1, 2, 3, 5});
  }
}
