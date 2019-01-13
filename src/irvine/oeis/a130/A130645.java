package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130645.
 * @author Sean A. Irvine
 */
public class A130645 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130645() {
    super(new long[] {1, -1, 0, -6, 6, 0, 1}, new long[] {0, 44, 1121, 1317, 1541, 7644, 8780});
  }
}
