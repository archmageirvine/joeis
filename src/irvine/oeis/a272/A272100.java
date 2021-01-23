package irvine.oeis.a272;

import irvine.oeis.LinearRecurrence;

/**
 * A272100 Integers n that are the sum of three nonzero squares while n*(n+1) is not.
 * @author Sean A. Irvine
 */
public class A272100 extends LinearRecurrence {

  /** Construct the sequence. */
  public A272100() {
    super(new long[] {-1, 1, 1}, new long[] {12, 19, 44});
  }
}
