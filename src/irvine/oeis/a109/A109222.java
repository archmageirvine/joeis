package irvine.oeis.a109;

import irvine.oeis.LinearRecurrence;

/**
 * A109222.
 * @author Sean A. Irvine
 */
public class A109222 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109222() {
    super(new long[] {-1, 0, 2, 1}, new long[] {1, 2, 3, 6});
  }
}
