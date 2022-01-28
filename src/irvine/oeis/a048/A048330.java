package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048330 Numbers that are repdigits in base 5.
 * @author Sean A. Irvine
 */
public class A048330 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048330() {
    super(new long[] {-5, 0, 0, 0, 6, 0, 0, 0}, new long[] {0, 1, 2, 3, 4, 6, 12, 18});
  }
}
