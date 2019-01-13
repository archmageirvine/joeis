package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199774.
 * @author Sean A. Irvine
 */
public class A199774 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199774() {
    super(new long[] {-1, 0, 0, 66, 0, 0}, new long[] {0, 3, 5, 32, 203, 333});
  }
}
