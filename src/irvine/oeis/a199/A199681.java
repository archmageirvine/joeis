package irvine.oeis.a199;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A199681 11*9^n+1.
 * @author Sean A. Irvine
 */
public class A199681 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199681() {
    super(new long[] {-9, 10}, new long[] {12, 100});
  }
}
