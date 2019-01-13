package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048759.
 * @author Sean A. Irvine
 */
public class A048759 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048759() {
    super(new long[] {1, 0, -3, 0, 3, 0}, new long[] {12, 12, 30, 24, 56, 40});
  }
}
