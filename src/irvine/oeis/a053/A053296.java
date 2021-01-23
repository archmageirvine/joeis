package irvine.oeis.a053;

import irvine.oeis.LinearRecurrence;

/**
 * A053296 Partial sums of A053295.
 * @author Sean A. Irvine
 */
public class A053296 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053296() {
    super(new long[] {-1, 6, -13, 7, 21, -49, 49, -27, 8}, new long[] {1, 8, 37, 129, 376, 967, 2267, 4950, 10220});
  }
}
