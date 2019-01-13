package irvine.oeis.a068;

import irvine.oeis.LinearRecurrence;

/**
 * A068548.
 * @author Sean A. Irvine
 */
public class A068548 extends LinearRecurrence {

  /** Construct the sequence. */
  public A068548() {
    super(new long[] {-256, 256, -96, 16}, new long[] {1, 32, 400, 3584});
  }
}
