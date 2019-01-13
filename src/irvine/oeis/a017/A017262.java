package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017262.
 * @author Sean A. Irvine
 */
public class A017262 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017262() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {262144, 24137569, 308915776, 1838265625, 7256313856L, 22164361129L, 56800235584L});
  }
}
