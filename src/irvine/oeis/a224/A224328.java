package irvine.oeis.a224;

import irvine.oeis.LinearRecurrence;

/**
 * A224328 Number of idempotent <code>n X n 0..3</code> matrices of rank <code>n-1</code>.
 * @author Sean A. Irvine
 */
public class A224328 extends LinearRecurrence {

  /** Construct the sequence. */
  public A224328() {
    super(new long[] {-16, 40, -33, 10}, new long[] {1, 14, 93, 508});
  }
}
