package irvine.oeis.a001;

import irvine.oeis.LinearRecurrence;

/**
 * A001636.
 * @author Sean A. Irvine
 */
public class A001636 extends LinearRecurrence {

  /** Construct the sequence. */
  public A001636() {
    super(new long[] {1, 1, 1, 1, 1, 0}, new long[] {0, 2, 3, 6, 10, 17});
  }
}
