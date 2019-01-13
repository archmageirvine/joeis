package irvine.oeis.a299;

import irvine.oeis.LinearRecurrence;

/**
 * A299645.
 * @author Sean A. Irvine
 */
public class A299645 extends LinearRecurrence {

  /** Construct the sequence. */
  public A299645() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 3, 13, 22, 42});
  }
}
