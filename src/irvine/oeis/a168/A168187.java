package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168187 a(n) = n^3*(n^6 + 1)/2.
 * @author Sean A. Irvine
 */
public class A168187 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168187() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {0, 1, 260, 9855, 131104, 976625, 5038956, 20176975, 67109120, 193710609});
  }
}
