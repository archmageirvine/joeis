package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070408.
 * @author Sean A. Irvine
 */
public class A070408 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070408() {
    super(new long[] {1, -1, 0, 0, 0, 1}, new long[] {1, 7, 5, 13, 3, 21});
  }
}
