package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047436.
 * @author Sean A. Irvine
 */
public class A047436 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047436() {
    super(new long[] {-1, 1, 1}, new long[] {5, 6, 13});
  }
}
