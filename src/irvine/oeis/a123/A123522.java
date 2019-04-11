package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123522 Not of the form <code>n +</code> [log_10 <code>n]</code>.
 * @author Sean A. Irvine
 */
public class A123522 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123522() {
    super(new long[] {10, -21, 12}, new long[] {0, 10, 101});
  }
}
