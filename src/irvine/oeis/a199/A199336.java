package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199336.
 * @author Sean A. Irvine
 */
public class A199336 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199336() {
    super(new long[] {-1, 0, 8, 0}, new long[] {1, 3, 5, 23});
  }
}
