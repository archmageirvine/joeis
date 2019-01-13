package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291249.
 * @author Sean A. Irvine
 */
public class A291249 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291249() {
    super(new long[] {1, 1, -6, -3, 14, 3, -14, -3, 6, 1}, new long[] {1, 2, 5, 10, 23, 47, 102, 214, 452, 955});
  }
}
