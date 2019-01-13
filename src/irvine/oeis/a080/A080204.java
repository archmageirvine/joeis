package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080204.
 * @author Sean A. Irvine
 */
public class A080204 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080204() {
    super(new long[] {-1, 1, -2, 3}, new long[] {1, 3, 10, 23});
  }
}
