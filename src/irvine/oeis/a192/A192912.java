package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192912.
 * @author Sean A. Irvine
 */
public class A192912 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192912() {
    super(new long[] {1, -1, 2, 5, 4, 1}, new long[] {0, 1, 0, 3, 10, 24});
  }
}
