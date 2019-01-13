package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134507.
 * @author Sean A. Irvine
 */
public class A134507 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134507() {
    super(new long[] {1, -4, 6, -5, 5, -6, 4}, new long[] {0, 4, 19, 57, 134, 269, 486});
  }
}
