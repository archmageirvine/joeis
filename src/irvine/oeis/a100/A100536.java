package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100536.
 * @author Sean A. Irvine
 */
public class A100536 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100536() {
    super(new long[] {1, -3, 3}, new long[] {1, 10, 25});
  }
}
