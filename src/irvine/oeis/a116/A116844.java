package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116844.
 * @author Sean A. Irvine
 */
public class A116844 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116844() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 2, 5, 14, 41, 116, 302});
  }
}
