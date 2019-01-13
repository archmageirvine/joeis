package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123392.
 * @author Sean A. Irvine
 */
public class A123392 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123392() {
    super(new long[] {1, 2, 2, 1}, new long[] {0, 0, 0, 1});
  }
}
