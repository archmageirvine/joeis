package irvine.oeis.a199;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A199213 (3*5^n+1)/2.
 * @author Sean A. Irvine
 */
public class A199213 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199213() {
    super(new long[] {-5, 6}, new long[] {2, 8});
  }
}
