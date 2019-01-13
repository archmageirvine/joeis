package irvine.oeis.a220;

import irvine.oeis.LinearRecurrence;

/**
 * A220755.
 * @author Sean A. Irvine
 */
public class A220755 extends LinearRecurrence {

  /** Construct the sequence. */
  public A220755() {
    super(new long[] {1, -1, -98, 98, 1}, new long[] {0, 1, 28, 117, 2760});
  }
}
