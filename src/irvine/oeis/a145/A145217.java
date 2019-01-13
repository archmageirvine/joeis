package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145217.
 * @author Sean A. Irvine
 */
public class A145217 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145217() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {1, 32, 418, 3104, 16003, 64064, 213060, 614976, 1587333, 3742816});
  }
}
