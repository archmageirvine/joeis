package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016781 (3*n+1)^5.
 * @author Sean A. Irvine
 */
public class A016781 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016781() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 1024, 16807, 100000, 371293, 1048576});
  }
}
