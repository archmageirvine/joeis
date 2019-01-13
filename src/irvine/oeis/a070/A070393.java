package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070393.
 * @author Sean A. Irvine
 */
public class A070393 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070393() {
    super(new long[] {1, -1, 0, 0, 0, 0, 1}, new long[] {1, 6, 10, 8, 9, 2, 12});
  }
}
