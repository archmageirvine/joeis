package irvine.oeis.a110;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A110005 n followed by n^2 followed by n^4 followed by n^3.
 * @author Sean A. Irvine
 */
public class A110005 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110005() {
    super(1, new long[] {1, 0, 0, 0, -5, 0, 0, 0, 10, 0, 0, 0, -10, 0, 0, 0, 5, 0, 0, 0}, new long[] {1, 1, 1, 1, 2, 4, 16, 8, 3, 9, 81, 27, 4, 16, 256, 64, 5, 25, 625, 125});
  }
}
