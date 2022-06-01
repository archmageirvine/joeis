package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016951 a(n) = (6*n + 3)^7.
 * @author Sean A. Irvine
 */
public class A016951 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016951() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {2187, 4782969, 170859375, 1801088541, 10460353203L, 42618442977L, 137231006679L, 373669453125L});
  }
}
