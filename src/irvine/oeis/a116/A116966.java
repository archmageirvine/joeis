package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116966.
 * @author Sean A. Irvine
 */
public class A116966 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116966() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {1, 3, 2, 4, 5});
  }
}
