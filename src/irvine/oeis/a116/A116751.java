package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116751.
 * @author Sean A. Irvine
 */
public class A116751 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116751() {
    super(new long[] {1, -6, 13, -12, 6}, new long[] {1, 2, 6, 21, 75});
  }
}
