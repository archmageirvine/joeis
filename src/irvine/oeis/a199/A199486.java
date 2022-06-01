package irvine.oeis.a199;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A199486 (9*7^n+1)/2.
 * @author Sean A. Irvine
 */
public class A199486 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199486() {
    super(new long[] {-7, 8}, new long[] {5, 32});
  }
}
