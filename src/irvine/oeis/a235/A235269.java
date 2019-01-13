package irvine.oeis.a235;

import irvine.oeis.LinearRecurrence;

/**
 * A235269.
 * @author Sean A. Irvine
 */
public class A235269 extends LinearRecurrence {

  /** Construct the sequence. */
  public A235269() {
    super(new long[] {1, -2, 1, 0, 0, 0, 0, 0, 0, -1, 2}, new long[] {0, 1, 3, 6, 9, 13, 17, 23, 28, 35, 42});
  }
}
