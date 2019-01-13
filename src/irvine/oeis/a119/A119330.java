package irvine.oeis.a119;

import irvine.oeis.LinearRecurrence;

/**
 * A119330.
 * @author Sean A. Irvine
 */
public class A119330 extends LinearRecurrence {

  /** Construct the sequence. */
  public A119330() {
    super(new long[] {1, 4, -6, 4}, new long[] {1, 2, 3, 4});
  }
}
