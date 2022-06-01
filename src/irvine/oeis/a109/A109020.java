package irvine.oeis.a109;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A109020 (2*7^n - 3*3^n + 1)/6.
 * @author Sean A. Irvine
 */
public class A109020 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109020() {
    super(new long[] {21, -31, 11}, new long[] {0, 1, 12});
  }
}
