package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047321.
 * @author Sean A. Irvine
 */
public class A047321 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047321() {
    super(new long[] {-1, 1, 0, 1}, new long[] {1, 5, 6, 8});
  }
}
