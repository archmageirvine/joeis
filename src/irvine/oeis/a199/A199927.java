package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199927.
 * @author Sean A. Irvine
 */
public class A199927 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199927() {
    super(new long[] {-1, 1, -5, -1}, new long[] {1, 1, -7, 3});
  }
}
