package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116737.
 * @author Sean A. Irvine
 */
public class A116737 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116737() {
    super(new long[] {1, 1, -1, -1, 2, 1, 3}, new long[] {1, 2, 6, 21, 72, 246, 845});
  }
}
