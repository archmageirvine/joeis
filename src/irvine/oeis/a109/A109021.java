package irvine.oeis.a109;

import irvine.oeis.LinearRecurrence;

/**
 * A109021 (2*7^n - 6*3^n + 4)/6.
 * @author Sean A. Irvine
 */
public class A109021 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109021() {
    super(new long[] {21, -31, 11}, new long[] {0, 0, 8});
  }
}
