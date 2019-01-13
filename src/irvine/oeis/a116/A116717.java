package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116717.
 * @author Sean A. Irvine
 */
public class A116717 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116717() {
    super(new long[] {-1, 2, 1, -5, 4}, new long[] {1, 2, 5, 12, 26});
  }
}
