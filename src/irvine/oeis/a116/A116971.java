package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116971.
 * @author Sean A. Irvine
 */
public class A116971 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116971() {
    super(new long[] {4, -9, 6}, new long[] {10, 56, 242});
  }
}
