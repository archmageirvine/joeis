package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116774.
 * @author Sean A. Irvine
 */
public class A116774 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116774() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 2, 6, 21, 69, 198, 498});
  }
}
