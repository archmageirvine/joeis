package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254875.
 * @author Sean A. Irvine
 */
public class A254875 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254875() {
    super(new long[] {-1, 2, 0, -1, -1, 0, 2}, new long[] {1, 3, 8, 16, 28, 45, 68});
  }
}
