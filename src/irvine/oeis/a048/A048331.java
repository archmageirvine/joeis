package irvine.oeis.a048;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A048331 Numbers that are repdigits in base 6.
 * @author Sean A. Irvine
 */
public class A048331 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048331() {
    super(new long[] {-6, 0, 0, 0, 0, 7, 0, 0, 0, 0}, new long[] {0, 1, 2, 3, 4, 5, 7, 14, 21, 28});
  }
}
