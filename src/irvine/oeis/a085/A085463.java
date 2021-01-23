package irvine.oeis.a085;

import irvine.oeis.LinearRecurrence;

/**
 * A085463 Number of 5-tuples (v1,v2,v3,v4,v5) of nonnegative integers less than n such that v1&lt;=v4, v1&lt;=v5, v2&lt;=v4, v2&lt;=v5 and v3&lt;=v4.
 * @author Sean A. Irvine
 */
public class A085463 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085463() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 12, 63, 219, 594, 1365});
  }
}
