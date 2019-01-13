package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116715.
 * @author Sean A. Irvine
 */
public class A116715 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116715() {
    super(new long[] {1, 3, 2, 1, 1}, new long[] {1, 2, 5, 12, 25});
  }
}
