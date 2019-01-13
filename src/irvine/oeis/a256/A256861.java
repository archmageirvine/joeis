package irvine.oeis.a256;

import irvine.oeis.LinearRecurrence;

/**
 * A256861.
 * @author Sean A. Irvine
 */
public class A256861 extends LinearRecurrence {

  /** Construct the sequence. */
  public A256861() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {1, 8, 42, 168, 546, 1512, 3696, 8184});
  }
}
