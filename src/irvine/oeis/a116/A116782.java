package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116782.
 * @author Sean A. Irvine
 */
public class A116782 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116782() {
    super(new long[] {-2, 9, -11, 6}, new long[] {1, 2, 6, 21});
  }
}
