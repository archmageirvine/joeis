package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048328 Numbers that are repdigits in base 3.
 * @author Sean A. Irvine
 */
public class A048328 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048328() {
    super(new long[] {-3, 0, 4, 0}, new long[] {0, 1, 2, 4});
  }
}
