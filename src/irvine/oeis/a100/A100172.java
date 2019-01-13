package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100172.
 * @author Sean A. Irvine
 */
public class A100172 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100172() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 32, 150, 412});
  }
}
