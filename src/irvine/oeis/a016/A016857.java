package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016857.
 * @author Sean A. Irvine
 */
public class A016857 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016857() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {0, 1953125, 1000000000, 38443359375L, 512000000000L, 3814697265625L, 19683000000000L, 78815638671875L, 262144000000000L, 756680642578125L});
  }
}
