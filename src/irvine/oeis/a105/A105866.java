package irvine.oeis.a105;

import irvine.oeis.LinearRecurrence;

/**
 * A105866.
 * @author Sean A. Irvine
 */
public class A105866 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105866() {
    super(new long[] {-4, -2, 5, 1}, new long[] {0, 1, 1, 6});
  }
}
