package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130520.
 * @author Sean A. Irvine
 */
public class A130520 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130520() {
    super(new long[] {1, -2, 1, 0, 0, -1, 2}, new long[] {0, 0, 0, 0, 0, 1, 2});
  }
}
