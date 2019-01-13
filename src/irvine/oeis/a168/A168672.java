package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168672.
 * @author Sean A. Irvine
 */
public class A168672 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168672() {
    super(new long[] {-1, 1, 1}, new long[] {2, 13, 19});
  }
}
