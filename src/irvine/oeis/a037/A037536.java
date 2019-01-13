package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037536.
 * @author Sean A. Irvine
 */
public class A037536 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037536() {
    super(new long[] {-3, 1, 0, 3}, new long[] {1, 5, 16, 49});
  }
}
