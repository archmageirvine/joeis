package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083089.
 * @author Sean A. Irvine
 */
public class A083089 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083089() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 1}, new long[] {0, 2, 4, 6, 7, 9, 11, 12});
  }
}
