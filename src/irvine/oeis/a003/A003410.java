package irvine.oeis.a003;

import irvine.oeis.LinearRecurrence;

/**
 * A003410.
 * @author Sean A. Irvine
 */
public class A003410 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003410() {
    super(new long[] {0, 1, 0, 1}, new long[] {1, 2, 3, 5});
  }
}
