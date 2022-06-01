package irvine.oeis.a199;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A199107 5*12^n-1.
 * @author Sean A. Irvine
 */
public class A199107 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199107() {
    super(new long[] {-12, 13}, new long[] {4, 59});
  }
}
