package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130610.
 * @author Sean A. Irvine
 */
public class A130610 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130610() {
    super(new long[] {1, -1, 0, -6, 6, 0, 1}, new long[] {0, 40, 901, 1077, 1281, 6160, 7180});
  }
}
