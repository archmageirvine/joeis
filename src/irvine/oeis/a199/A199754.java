package irvine.oeis.a199;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A199754 (5*11^n+1)/2.
 * @author Sean A. Irvine
 */
public class A199754 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199754() {
    super(new long[] {-11, 12}, new long[] {3, 28});
  }
}
