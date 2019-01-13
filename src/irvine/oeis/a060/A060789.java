package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060789.
 * @author Sean A. Irvine
 */
public class A060789 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060789() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0}, new long[] {1, 1, 1, 2, 5, 1, 7, 4, 3, 5, 11, 2});
  }
}
