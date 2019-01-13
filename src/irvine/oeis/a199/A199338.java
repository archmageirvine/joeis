package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199338.
 * @author Sean A. Irvine
 */
public class A199338 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199338() {
    super(new long[] {-1, 0, 8, 0}, new long[] {1, 11, 19, 89});
  }
}
